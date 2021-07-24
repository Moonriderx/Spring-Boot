package com.example.demo.Service;

import com.example.demo.Model.Person;
import com.example.demo.dao.PersonDao;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

}
