package com.mastek.idpapi.source;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/sources/")
public interface SourceAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<Source> getSources();

    @POST
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Source addNewSource(@RequestBody Source newSource);
}
