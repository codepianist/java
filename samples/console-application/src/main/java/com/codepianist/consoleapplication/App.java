package com.codepianist.consoleapplication;

import com.codepianist.consoleapplication.db.sql.repository.PersonRepository;
import com.codepianist.consoleapplication.model.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Slf4j
@SpringBootApplication
public class App implements CommandLineRunner {

    private PersonRepository personRepository;
    @Autowired public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository; }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Running app...");
        String in= "";
        while(true) {
            System.out.print(" ----------------------------------------> Please enter a name (or type 'exit'): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            in = reader.readLine();
            if("exit".equalsIgnoreCase(in)) {
                log.info("Exiting... Checking persons in database:");
                personRepository.findAll().forEach(p-> log.info(" {}- {};", p.getId(), p.getName()));
                return;
            }
            log.info("Persisting {}...", in);
            personRepository.save(PersonEntity.of(in));
            log.info("Done!");
        }

    }
}
