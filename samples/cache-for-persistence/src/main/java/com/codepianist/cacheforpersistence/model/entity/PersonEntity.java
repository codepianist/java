package com.codepianist.cacheforpersistence.model.entity;

import lombok.*;
import javax.persistence.*;

import com.codepianist.cacheforpersistence.model.Person;

@Data @NoArgsConstructor
@Entity @Table(name= "persons")
public class PersonEntity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;

    public static PersonEntity of(String name) {
        PersonEntity n= new PersonEntity();
        n.setName(name);
        return n;
    }

}
