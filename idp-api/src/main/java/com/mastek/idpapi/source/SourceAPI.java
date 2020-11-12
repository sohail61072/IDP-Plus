package com.mastek.idpapi.source;

import com.mastek.idpapi.customer.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/sources/")
public interface SourceAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<Source> getSources();
}
