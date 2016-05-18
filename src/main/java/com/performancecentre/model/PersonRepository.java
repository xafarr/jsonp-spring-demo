package com.performancecentre.model;

import com.performancecentre.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xafarr on 17/05/2016.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByEid(String eid);
}
