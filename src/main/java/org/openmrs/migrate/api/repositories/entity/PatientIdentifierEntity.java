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
@Table(name = "patient_identifier")
@Getter
@Setter
@Builder
@AllArgsConstructor
 @NoArgsConstructor
public class PatientIdentifierEntity {
  
    @Id
    @Column(name="patient_identifier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    public long patient_identifier_id;
    
    @Column(name="patient_id")    
	public long patient_id;
	
    @Column(name="identifier")    
	public String identifier;
	
    @Column(name="identifier_type")    
	public int identifier_type;
	
    @Column(name="preferred")    
	public byte preferred;
	
    @Column(name="location_id")    
	public int location_id;
	
    @Column(name="creator")    
	public int creator;
	
    @Column(name="date_created")    
	public java.util.Date date_created;
	
    @Column(name="date_changed")    
	public java.util.Date date_changed;
	
    @Column(name="changed_by")    
	public int changed_by;
	
    @Column(name="voided")    
	public byte voided;
	
    @Column(name="voided_by")    
	public int voided_by;
	
    @Column(name="date_voided")    
	public java.util.Date date_voided;
	
    @Column(name="void_reason")    
	public String void_reason;
	
    @Column(name="uuid")    
	public String uuid;
}

