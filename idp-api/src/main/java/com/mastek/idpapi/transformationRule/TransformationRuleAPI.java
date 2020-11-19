package com.mastek.idpapi.transformationRule;

import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/transrule/")
public interface TransformationRuleAPI {

        @GET
        @Path("/")
        @Produces({MediaType.APPLICATION_JSON})
        public Set<TransformationRule> getTransformationRule();

        @POST
        @Path("/")
        @Produces({MediaType.APPLICATION_JSON})
        @Consumes(MediaType.APPLICATION_JSON)
        public TransformationRule addNewTransformationRule(@RequestBody TransformationRule newTransRule);

}
