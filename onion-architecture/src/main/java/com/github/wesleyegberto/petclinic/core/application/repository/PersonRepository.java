package com.github.wesleyegberto.petclinic.core.application.repository;

import com.github.wesleyegberto.petclinic.core.domain.person.Person;

public interface PersonRepository {
    void persist(Person person);
}
