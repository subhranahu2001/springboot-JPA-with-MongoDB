package com.app.service;

import com.app.Repository.PersonRepository;
import com.app.collections.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;


    @Override
    public String save(Person person) {
        return personRepository.save(person).toString();
    }

    @Override
    public List<Person> getAllStudent() {
        return personRepository.findAll();
    }
}
