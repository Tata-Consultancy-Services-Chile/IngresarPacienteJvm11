package org.openmrs.migrate.api.controllers;


import org.openmrs.migrate.api.dtos.MessageDTO;


import org.openmrs.migrate.api.utils.HeadersUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerController {

    static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);



    @ExceptionHandler
    @ResponseBody
    ResponseEntity<MessageDTO> handleException(final Exception ex) {
        logger.info("handleException - init");
        logger.error("Se ha capturado un error", ex);
        MessageDTO response = handleResponseMessage();
        logger.info("handleException - end");
        return new ResponseEntity<>(response, HeadersUtils.getGenericHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    
    private MessageDTO handleResponseMessage() {
        return new MessageDTO("",""); 
    }

}