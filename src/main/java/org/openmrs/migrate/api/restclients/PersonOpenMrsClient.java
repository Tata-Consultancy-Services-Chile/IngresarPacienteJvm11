package org.openmrs.migrate.api.restclients;

import org.openmrs.migrate.api.restclients.dto.PersonDTO;
import org.openmrs.migrate.api.restclients.dto.PersonResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="PersonOpenMrsRest", url="http://localhost:8081")
public interface PersonOpenMrsClient {
	@RequestMapping(method = RequestMethod.POST, value = "/openmrs-standalone/ws/rest/v1/person", produces = "application/json")
	PersonResponseDTO createPerson(@RequestHeader(value="Authorization") String authorization,@RequestBody PersonDTO request);    
}
