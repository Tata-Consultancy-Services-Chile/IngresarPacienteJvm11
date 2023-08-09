package org.openmrs.migrate.api.restclients.dto;



import org.springframework.boot.actuate.endpoint.web.Link;

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
public class PreferredAddressDTO {
    public String uuid;
    public String display;
    public LinkDTO[] links;    
}
