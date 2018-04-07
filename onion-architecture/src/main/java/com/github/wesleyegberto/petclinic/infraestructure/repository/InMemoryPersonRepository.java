package com.github.wesleyegberto.petclinic.infraestructure.repository;

import com.github.wesleyegberto.petclinic.core.application.repository.PersonRepository;
import com.github.wesleyegberto.petclinic.core.domain.person.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class InMemoryPersonRepository implements PersonRepository {
    private List<Person> database = new ArrayList<>();

    public void persist(Person person) {
        this.database.add(person);
    }
}
