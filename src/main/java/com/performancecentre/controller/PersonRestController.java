package com.performancecentre.controller;

import com.performancecentre.domain.Person;
import com.performancecentre.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xafarr on 17/05/2016.
 */
@RestController
@RequestMapping(path = "/api")
public class PersonRestController {

    private PersonService personService;

    @Autowired
    public PersonRestController(final PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(path = "/name/{eid}", method = RequestMethod.GET)
    public Person getNameFromId(@PathVariable(value = "eid") String eid) {
        Person person = personService.findPersonByEid(eid);
        return person;
    }
}
