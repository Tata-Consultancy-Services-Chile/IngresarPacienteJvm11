package org.openmrs.migrate.api.repositories;

import org.openmrs.migrate.api.repositories.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("PatientRepository")
public interface PatientEntityRepository extends CrudRepository<PatientEntity, Long>{
        
}
