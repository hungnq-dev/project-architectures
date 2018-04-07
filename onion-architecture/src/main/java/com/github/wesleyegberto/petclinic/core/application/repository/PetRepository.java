package com.github.wesleyegberto.petclinic.core.application.repository;

import com.github.wesleyegberto.petclinic.core.domain.pet.Pet;

import java.util.List;

public interface PetRepository {
    void persist(Pet pet);
    List<Pet> getAll();
}
