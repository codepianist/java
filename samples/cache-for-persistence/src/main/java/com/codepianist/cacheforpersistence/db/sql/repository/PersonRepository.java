package com.codepianist.cacheforpersistence.db.sql.repository;

import com.codepianist.cacheforpersistence.model.entity.PersonEntity;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {


    //@Scheduled(fixedRateString = "50000" )
    @Query(value= "select p from PersonEntity p where p.name like %:name%")
    List<PersonEntity> findByNameSimilarity(@Param("name") String similar);

}
