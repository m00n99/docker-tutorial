package ru.zakirov.dockerTutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zakirov.dockerTutorial.models.Person;
import ru.zakirov.dockerTutorial.services.PersonService;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> allPerson(){
        return personService.findAll();
    }
}
