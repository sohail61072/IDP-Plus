package com.mastek.idpapi.lookup;

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
    public Lookup addNewLookup(@BeanParam Lookup newLookup);
}
