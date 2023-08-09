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
@Table(name = "patient")
@Getter
@Setter
@Builder
@AllArgsConstructor
 @NoArgsConstructor
public class PatientEntity {
  
    @Id
    @Column(name="patient_id")    
	public long patientId;

    @Column(name="creator")
	public int creator;
	
    @Column(name="date_created")
    public java.util.Date dateCreated;
	
    @Column(name="changed_by")
    public String changedBy;
	
    @Column(name="date_changed")
    public java.util.Date dateChanged;
	
    @Column(name="voided")
    public int voided;
	
    @Column(name="voided_by")
    public int voided_by;
	
    @Column(name="date_voided")
    public java.util.Date dateVoided;
	
    @Column(name="void_reason")
    public String voidReason;
	
    @Column(name="allergy_status")
    public String allergyStatus;


}
