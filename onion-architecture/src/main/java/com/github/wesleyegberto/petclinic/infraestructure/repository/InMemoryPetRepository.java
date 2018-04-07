package com.github.wesleyegberto.petclinic.infraestructure.repository;

import com.github.wesleyegberto.petclinic.core.application.repository.PetRepository;
import com.github.wesleyegberto.petclinic.core.domain.pet.Pet;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class InMemoryPetRepository implements PetRepository {
    private List<Pet> database = new ArrayList<>();

    public void persist(Pet pet) {
        this.database.add(pet);
    }

    public List<Pet> getAll() {
        return Collections.unmodifiableList(database);
    }
}
