package com.mastek.idpapi.datatransformation;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/datarules/")
public interface DTRAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<DTR> getDataRules();

    @POST
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public DTR addNewDataRule(@BeanParam DTR newDataRule);
}
