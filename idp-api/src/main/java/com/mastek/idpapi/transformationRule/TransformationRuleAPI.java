package com.mastek.idpapi.transformationRule;

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
        public TransformationRule addNewTransformationRule(@BeanParam TransformationRule newTransRule);

}
