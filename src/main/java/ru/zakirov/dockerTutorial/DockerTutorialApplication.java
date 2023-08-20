package ru.zakirov.dockerTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class DockerTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTutorialApplication.class, args);
	}

}
