package com.moderan.hometask.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> getBySearchString(String name) {
        List<Person> matchedList = new ArrayList<>();
        personRepository.findBySearchString(name).forEach(matchedList::add);;
        return matchedList;
    }
    

}
