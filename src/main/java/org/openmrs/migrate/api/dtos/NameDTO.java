package org.openmrs.migrate.api.dtos;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class NameDTO {
    @JsonProperty("givenName")
    public String givenName;
    @JsonProperty("familyName")
    public String familyName;    
}
