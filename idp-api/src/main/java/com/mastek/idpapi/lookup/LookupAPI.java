package com.mastek.idpapi.lookup;

import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/lookups/")
public interface LookupAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<Lookup> getLookups();

    @POST
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Lookup addNewLookup(@RequestBody Lookup newLookup);
}
