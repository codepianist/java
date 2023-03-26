package com.codepianist.consoleapplication.db.sql.repository;

import com.codepianist.consoleapplication.model.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
