package com.app.rinha.controller;

import com.app.rinha.model.Person;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {

    @GET
    @Path("/pessoas/{id}")
    public Response getPerson(@PathParam("id") String id) {
//        return Response.status(404).build();
        return Response.ok(new Person()).build();
    }

    @GET
    @Path("/pessoas")
    public Response searchPeople(@QueryParam("t") String query) {
        if (query == null) return Response.status(400).build();

        // "query" searches for name, nickname and/or stack
        // max 50 items

        return Response.ok(List.of()).build();
    }

    @GET
    @Path("/contagem-pessoas")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getTotalPeople() {
        return Response.ok(123).build();
    }

    @POST
    @Path("/pessoas")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPerson(Person person) {

//        return Response.status(422).build();
        return Response.created(URI.create("/pessoas/123")).build();
    }
}
