package com.mastek.idpapi.datatransformation;


import org.springframework.web.bind.annotation.RequestBody;

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
    @Consumes(MediaType.APPLICATION_JSON)
    public DTR addNewDataRule(@RequestBody DTR newDataRule);
}
