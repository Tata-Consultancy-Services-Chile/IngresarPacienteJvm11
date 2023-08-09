package org.openmrs.migrate.api.services;

import org.openmrs.migrate.api.dtos.PatientDTO;

public interface OpenRmsPatientService {

    PatientDTO savePatient(PatientDTO patient);



}