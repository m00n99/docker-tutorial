package ru.zakirov.dockerTutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.zakirov.dockerTutorial.models.Person;
import ru.zakirov.dockerTutorial.repositories.PersonRepository;
import ru.zakirov.dockerTutorial.services.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonRepository personRepository, PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> allPerson(){
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable int id){
        return personService.findById(id);
    }

    @PostMapping("/")
    public String savePerson(@RequestBody Person person){
        personService.save(person);
        return "Success " + person.getId();
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable int id){
        personService.deleteById(id);
        return "Success!";
    }
}
