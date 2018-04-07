package com.github.wesleyegberto.petclinic.presentation;

import com.github.wesleyegberto.petclinic.core.application.service.PetClinicService;
import com.github.wesleyegberto.petclinic.core.domain.pet.Pet;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("pets")
@Produces(MediaType.APPLICATION_JSON)
public class PetsResource {
    private PetClinicService service;

    @Deprecated
    public PetsResource() {}

    @Inject
    public PetsResource(PetClinicService service) {
        this.service = service;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Pet pet) {
        service.save(pet);
        return Response.ok().build();
    }

    @GET
    public Response getAll() {
        return Response.ok(service.getAll()).build();
    }
}
