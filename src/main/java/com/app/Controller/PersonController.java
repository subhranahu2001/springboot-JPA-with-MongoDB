package com.app.Controller;


import com.app.collections.Person;
import com.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public String save(@RequestBody Person person) {

        return this.personService.save(person);

    }

    @GetMapping("/getAllPerson")
    public String getAllStudent() {

        return this.personService.getAllStudent().toString();
    }

}
