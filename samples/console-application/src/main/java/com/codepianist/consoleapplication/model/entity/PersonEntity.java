package com.codepianist.consoleapplication.model.entity;

import lombok.*;

import javax.persistence.*;

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
