package com.moderan.hometask.person;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PersonController {
    @Autowired
    private PersonService personService;


    @PostMapping("/person")
    public ResponseEntity<Person> addPerson(@Valid @RequestBody Person person){
        Person newPerson = personService.addPerson(person);
        return new ResponseEntity<>(newPerson,HttpStatus.CREATED);
    }

   @RequestMapping(value="/person")
   public ResponseEntity<List<Person>> findPersonData(@RequestParam(name = "search") String query_string) {
       List<Person> result = personService.getBySearchString(query_string);
       if(result.isEmpty()){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(result,HttpStatus.OK);
   }
   
}
