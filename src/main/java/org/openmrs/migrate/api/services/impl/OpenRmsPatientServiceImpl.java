package org.openmrs.migrate.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

import org.openmrs.migrate.api.dtos.AddressDTO;
import org.openmrs.migrate.api.dtos.NameDTO;
import org.openmrs.migrate.api.dtos.PatientDTO;
import org.openmrs.migrate.api.repositories.PatientEntityRepository;
import org.openmrs.migrate.api.repositories.PatientIdentifierRepository;
import org.openmrs.migrate.api.repositories.PersonEntityRepository;
import org.openmrs.migrate.api.repositories.entity.PatientEntity;
import org.openmrs.migrate.api.repositories.entity.PatientIdentifierEntity;
import org.openmrs.migrate.api.repositories.entity.PersonEntity;
import org.openmrs.migrate.api.restclients.PersonOpenMrsClient;
import org.openmrs.migrate.api.restclients.dto.PersonDTO;
import org.openmrs.migrate.api.restclients.dto.PersonResponseDTO;
import org.openmrs.migrate.api.services.OpenRmsPatientService;

@Service("PatientService")
public class OpenRmsPatientServiceImpl implements OpenRmsPatientService {
    
    private final PatientEntityRepository patientEntityRepository;

    private final PatientIdentifierRepository patientIdentifierRepository;

    private final PersonEntityRepository personEntityRepository;
    
    private PersonOpenMrsClient personOpenMrsClient;

    @Autowired
    public OpenRmsPatientServiceImpl(
            final PatientEntityRepository patientEntityRepository,
            final PersonEntityRepository personEntityRepository,
            final PatientIdentifierRepository patientIdentifierRepository,
            PersonOpenMrsClient personOpenMrsClient) {
        this.patientIdentifierRepository = patientIdentifierRepository;
        this.patientEntityRepository = patientEntityRepository;
        this.personEntityRepository = personEntityRepository;
        this.personOpenMrsClient = personOpenMrsClient;
    }

    @Override
    public PatientDTO savePatient(PatientDTO patient) {
        PersonDTO personRQ = new PersonDTO();
        String authorization = "basic YWRtaW46QWRtaW4xMjM=";
        personRQ.setBirthdate(patient.getBirthdate());
        personRQ.setGender(patient.getGender());
        NameDTO[] names = new NameDTO[1];
        names[0] = new NameDTO(patient.getNames().get(0).getGivenName(), patient.getNames().get(0).getFamilyName());
        personRQ.setNames(names);
        AddressDTO[] address = new AddressDTO[1];
        address[0] = patient.getAddresses().get(0);
        personRQ.setAddress(address);
        PersonResponseDTO response = personOpenMrsClient.createPerson(authorization, personRQ);
        // Long personID = 108l;
        System.out.println(response.getUuid());

       

        

        long personId = personEntityRepository.getPersonIdByUID(response.getUuid());
        PatientIdentifierEntity pie = new PatientIdentifierEntity();

        Date now = new Date();

        PatientEntity patientDTO = PatientEntity.builder()
                .creator(1)
                .patientId(personId)
                .dateCreated(now)
                .voided(1)
                .voided_by(1)
                .changedBy(null)
                .allergyStatus("Unknown")
                .build();
        PatientEntity result = patientEntityRepository.save(patientDTO);


        pie.setPatient_id(personId);
        
        pie.setIdentifier_type(3);
        pie.setIdentifier("2121XY");
        pie.setPreferred((byte) 1);
        pie.setLocation_id(1);
        pie.setCreator(1);
        pie.setPatient_id(personId);
        pie.setVoided_by(1);
        pie.setChanged_by(1);
        pie.setUuid(response.getUuid());
        pie.setDate_created(now);
        PatientIdentifierEntity patientE = patientIdentifierRepository.save(pie);
        
        System.out.println(patientE.getIdentifier());


        System.out.println(result);
        return patient;
    }
}