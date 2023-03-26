package com.codepianist.cacheforpersistence.web.rest;

import com.codepianist.cacheforpersistence.db.sql.repository.PersonRepository;
import com.codepianist.cacheforpersistence.model.entity.PersonEntity;
import com.codepianist.cacheforpersistence.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService; }


    @RequestMapping(value= "/persons/{name}", method= RequestMethod.GET)
    public ResponseEntity<List<PersonEntity>> list(@PathVariable("name") String name) {
        log.info("Listing persons...");
        List<PersonEntity> list= personService.find(name);
        log.info("Done!");
        return ResponseEntity.status(200).body(list);
    }

    @RequestMapping(value= "/persons", method= RequestMethod.GET)
    public ResponseEntity<List<PersonEntity>> list() {
        log.info("Listing persons...");
        List<PersonEntity> list= personService.findAll();
        log.info("Done!");
        return ResponseEntity.status(200).body(list);
    }

}
