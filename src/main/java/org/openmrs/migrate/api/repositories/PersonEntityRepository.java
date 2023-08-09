package org.openmrs.migrate.api.repositories;
import org.openmrs.migrate.api.repositories.entity.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository("PersonRepository")
public interface PersonEntityRepository extends CrudRepository<PersonEntity, Long>{

    @Query(value = "select p.person_id from person p where p.uuid=:uuid ",nativeQuery=true) 
    Long getPersonIdByUID(@Param("uuid") String  uuid);        

    Optional<PersonEntity> findByUuid(String uuid);
}

