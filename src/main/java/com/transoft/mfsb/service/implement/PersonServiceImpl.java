package com.transoft.mfsb.service.implement;

import com.transoft.mfsb.domain.Person;
import com.transoft.mfsb.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> listPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Roger", "Lopez", 20));
        people.add(new Person(2, "Regina", "Ledezma", 24));
        people.add(new Person(3, "Sergio", "Velez", 27));
        return people;
    }
}
