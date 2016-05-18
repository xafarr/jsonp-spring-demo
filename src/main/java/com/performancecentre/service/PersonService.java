package com.performancecentre.service;

import com.performancecentre.domain.Person;
import com.performancecentre.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xafarr on 17/05/2016.
 */
@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person findPersonByEid(String eid) {
        Person person = personRepository.findPersonByEid(eid);
        return person;
    }
}
