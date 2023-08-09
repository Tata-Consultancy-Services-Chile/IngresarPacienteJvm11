package org.openmrs.migrate.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDTO {
    @JsonProperty("address1")
    public String address;
    @JsonProperty("cityVillage")
    public String cityVillage;
    @JsonProperty("country")
    public String country;
    @JsonProperty("postalCode")
    public String postalCode; 
}
