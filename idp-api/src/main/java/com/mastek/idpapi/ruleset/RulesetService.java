package com.mastek.idpapi.ruleset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@Component
public class RulesetService implements RulesetAPI {

    @Autowired
    RulesetJPADAO rulesetDAO;

    public Set<Ruleset> getRulesets(){
        return rulesetDAO.findAll();
    }

    public Ruleset addNewRuleset(@RequestBody Ruleset newRuleset){
        return rulesetDAO.save(newRuleset);
    }
}
