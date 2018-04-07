package com.github.wesleyegberto.petclinic.core.application.service;

import com.github.wesleyegberto.petclinic.core.application.repository.PersonRepository;
import com.github.wesleyegberto.petclinic.core.application.repository.PetRepository;
import com.github.wesleyegberto.petclinic.core.domain.pet.Pet;

import java.util.List;
import javax.inject.Inject;

public class PetClinicService {
    private PetRepository petRepository;
    private PersonRepository personRepository;

    @Inject
    public PetClinicService(PetRepository petRepository, PersonRepository personRepository) {
        this.petRepository = petRepository;
        this.personRepository = personRepository;
    }

    public void save(Pet pet) {
        petRepository.persist(pet);
        personRepository.persist(pet.getOwner());
    }

    public List<Pet> getAll() {
        return petRepository.getAll();
    }
}
