package org.openmrs.migrate.api.restclients.dto;
import org.openmrs.migrate.api.dtos.AddressDTO;
import org.openmrs.migrate.api.dtos.NameDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;



import java.util.Date;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PersonDTO {
    @JsonProperty("names")
    private NameDTO[] names;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birthdate")
    private Date birthdate;
    @JsonProperty("addresses")
    private AddressDTO[] address;

}
