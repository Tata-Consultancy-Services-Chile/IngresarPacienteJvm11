package org.openmrs.migrate.api.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@AllArgsConstructor
@Getter
@Setter
public class PatientDTO implements Serializable {

    private static final long serialVersionUID = -6533078367549236908L;

    public String gender;
    public int age;
    public Date birthdate;
    public boolean birthdateEstimated;
    public boolean dead;
    public Date deathDate;
    public Date causeOfDeath;
    public ArrayList<NameDTO> names;
    public ArrayList<AddressDTO> addresses;

}