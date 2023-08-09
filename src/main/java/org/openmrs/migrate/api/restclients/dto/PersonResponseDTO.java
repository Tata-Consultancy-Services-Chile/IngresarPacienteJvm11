package org.openmrs.migrate.api.restclients.dto;

import java.util.ArrayList;
import java.util.Date;

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
public class PersonResponseDTO {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("display")
    private String display;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private int age;
    @JsonProperty("birthdate")
    private Date birthdate;
    @JsonProperty("birthdateEstimated")
    private boolean birthdateEstimated;
    @JsonProperty("dead")
    private boolean dead;
    @JsonProperty("deathDate")
    private String deathDate;
    @JsonProperty("causeOfDeath")
    private int causeOfDeath;
    @JsonProperty("preferredName")
    private PreferredNameDTO preferredName;
    @JsonProperty("preferredAddress")
    private PreferredAddressDTO preferredAddress;
    @JsonProperty("attributes")
    private ArrayList<LinkDTO> attributes;
    @JsonProperty("voided")
    private boolean voided;
    @JsonProperty("birthtime")
    private String birthtime;
    @JsonProperty("deathdateEstimated")
    private boolean deathdateEstimated;
    @JsonProperty("links")
    private LinkDTO[] links;
    @JsonProperty("resourceVersion")
    private String resourceVersion;
}
