package com.github.wesleyegberto.petclinic.presentation;

import com.github.wesleyegberto.petclinic.application.PetClinicService;
import com.github.wesleyegberto.petclinic.domain.Pet;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("pets")
@Produces(MediaType.APPLICATION_JSON)
public class PetsResource {

    @Inject
    private PetClinicService service;

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
