package ru.zakirov.dockerTutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.zakirov.dockerTutorial.models.Person;
import ru.zakirov.dockerTutorial.repositories.PersonRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public void addTwoPeople(){
        personRepository.save(new Person(1,"Андрей", "andrey@mail.ru"));
        personRepository.save(new Person(2,"Артём", "artem@mail.ru"));
    }

    public List<Person> findAll(){
        addTwoPeople();
        return personRepository.findAll();
    }
}
