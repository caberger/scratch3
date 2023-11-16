package org.acme.feature.vehicle;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/vehicles")
public class VehicleResource {
    @Inject
    VehicleDao dao;
    @Inject VehicleMapper mapper;
    @GET
    public Response all() {
       var vehicles = dao.all();
       var dtos = vehicles.stream().map(mapper::toResource);
       return Response.ok(dtos).build();
    }
}
