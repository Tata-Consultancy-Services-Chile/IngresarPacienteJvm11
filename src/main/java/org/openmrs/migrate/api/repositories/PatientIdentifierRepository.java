package org.openmrs.migrate.api.repositories;

import org.openmrs.migrate.api.repositories.entity.PatientEntity;
import org.openmrs.migrate.api.repositories.entity.PatientIdentifierEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("PatientIdentifierRepository")
public interface PatientIdentifierRepository extends CrudRepository<PatientIdentifierEntity, Long>{
        
}
