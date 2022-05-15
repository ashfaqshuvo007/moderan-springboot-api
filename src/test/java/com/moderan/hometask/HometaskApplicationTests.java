package com.moderan.hometask;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.moderan.hometask.person.Person;
import com.moderan.hometask.person.PersonRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HometaskApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void testPersonCreate(){

		Person person = new Person();
		person.setPerson("Jam Doe");
		Person newPerson = personRepository.save(person);
		assertNotNull(personRepository.getById(newPerson.getId()));

	}

}
