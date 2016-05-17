package com.performancecentre.controller;

import com.performancecentre.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xafarr on 17/05/2016.
 */
@RestController
@RequestMapping(path = "/api")
public class PersonRestController {

    @RequestMapping(path = "/name", method = RequestMethod.GET)
    public Person getNameFromId() {
        Person person = new Person();
        person.setId(1L);
        person.setName("Zafar");
        return person;
    }
}
