package com.mastek.idpapi.ruleset;

import com.mastek.idpapi.lookup.Lookup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/rulesets/")
public interface RulesetAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<Ruleset> getRulesets();

    @POST
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Ruleset addNewRuleset(@BeanParam Ruleset newRuleset);
}
