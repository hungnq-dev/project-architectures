package com.github.wesleyegberto.petclinic.application;

import com.github.wesleyegberto.petclinic.domain.Pet;
import com.github.wesleyegberto.petclinic.infrastructure.repositores.PersonRepository;
import com.github.wesleyegberto.petclinic.infrastructure.repositores.PetRepository;

import javax.inject.Inject;
import java.util.List;

public class PetClinicService {
    @Inject
    private PetRepository petRepository;
    @Inject
    private PersonRepository personRepository;

    public void save(Pet pet) {
        petRepository.persist(pet);
        personRepository.persist(pet.getOwner());
    }

    public List<Pet> getAll() {
        return petRepository.getAll();
    }
}
