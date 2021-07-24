package com.example.demo.dao;

import com.example.demo.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person); // Allows us to insert person with a give ID

    default int insertPerson(Person person) { // Allows us to generate the UUID's ourselves
     UUID id = UUID.randomUUID();
     return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);





}
