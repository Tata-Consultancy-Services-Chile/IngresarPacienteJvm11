package org.openmrs.migrate.api.controllers;

import org.openmrs.migrate.api.dtos.PatientDTO;
import org.openmrs.migrate.api.services.OpenRmsPatientService;
import org.openmrs.migrate.api.utils.HeadersUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migrate/patient")
public class PatientController {

    static final Logger logger = LoggerFactory.getLogger(PatientController.class);
    static final Logger stdLogger = LoggerFactory.getLogger("std.logger");

    private final OpenRmsPatientService patientService;

    @Autowired
    public PatientController(final OpenRmsPatientService helloService) {
        this.patientService = helloService;
    }



    @RequestMapping(path = { "/save" }, method = { RequestMethod.POST }, 
                        produces = { MediaType.APPLICATION_JSON_VALUE })
    
    public ResponseEntity<PatientDTO> save(@RequestBody PatientDTO patienRQ)  {
        PatientDTO controllerResponse = patientService.savePatient(patienRQ);
        return new ResponseEntity<>(controllerResponse, HeadersUtils.getGenericHeaders(), HttpStatus.OK);
    }

}