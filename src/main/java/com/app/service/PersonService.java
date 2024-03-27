package com.app.service;

import com.app.collections.Person;
import com.app.collections.Student;

import java.util.List;

public interface PersonService {

    String save(Person person);
    List<Person> getAllStudent() ;
}
