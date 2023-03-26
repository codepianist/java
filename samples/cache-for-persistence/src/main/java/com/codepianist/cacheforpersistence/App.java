package com.codepianist.cacheforpersistence;

import com.codepianist.cacheforpersistence.db.sql.repository.PersonRepository;
import com.codepianist.cacheforpersistence.model.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@EnableCaching
@EnableScheduling
@Slf4j
@SpringBootApplication
public class App  {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
