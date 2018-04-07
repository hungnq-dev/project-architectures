package com.github.wesleyegberto.petclinic.infrastructure.repositores;

import com.github.wesleyegberto.petclinic.domain.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonRepository {
    private List<Person> database = new ArrayList<>();

    public void persist(Person person) {
        this.database.add(person);
    }
}
