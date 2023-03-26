package com.codepianist.cacheforpersistence.service;

import com.codepianist.cacheforpersistence.db.sql.repository.PersonRepository;
import com.codepianist.cacheforpersistence.model.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonService {

    private PersonRepository personRepository;
    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository; }

    @Cacheable(value="persons", key="#name", condition="#name!=null")
    public List<PersonEntity> find(String name){
        return personRepository.findByNameSimilarity(name);
    }
    public List<PersonEntity> findAll(){
        return personRepository.findAll();
    }

    @CacheEvict(allEntries = true, value= "persons")
    @Scheduled(fixedRateString= "${caching.queries.personsBySimilarity}")
    public void evictAll() {
        log.info("Evicting cache...");
    }

}
