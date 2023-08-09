package org.openmrs.migrate.api.repositories.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @Column(name="person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    
    @Column(name="gender")
	private String gender;
	
    @Column(name="birthdate")
    private java.util.Date birthdate;
	
    @Column(name="cause_of_death")
    private int causeOfDeath;
	
    @Column(name="creator")
    private int creator;
	
    @Column(name="changed_by")
    private int changedBy;
	
    @Column(name="voided_by")
    private int voidedBy;
	
    @Column(name="void_reason")
    private String voidReason;
	
    @Column(name="uuid")
    private String uuid;
	
    @Column(name="cause_of_death_non_coded")
    private String causeOfDeathNonCoded;


}
