package com.mastek.idpapi.ruleset;

import com.mastek.idpapi.lookup.Lookup;
import org.springframework.web.bind.annotation.RequestBody;

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
    @Consumes(MediaType.APPLICATION_JSON)
    public Ruleset addNewRuleset(@RequestBody Ruleset newRuleset);
}
