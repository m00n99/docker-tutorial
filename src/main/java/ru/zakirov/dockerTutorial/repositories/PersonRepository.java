package ru.zakirov.dockerTutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.zakirov.dockerTutorial.models.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer> {
}
