package com.github.wesleyegberto.petclinic.infrastructure.repositores;

import com.github.wesleyegberto.petclinic.domain.Pet;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class PetRepository {
    private List<Pet> database = new ArrayList<>();

    public void persist(Pet pet) {
        this.database.add(pet);
    }

    public List<Pet> getAll() {
        return Collections.unmodifiableList(database);
    }
}
