package com.mastek.idpapi.ruleset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class RulesetService implements RulesetAPI {

    @Autowired
    RulesetJPADAO rulesetDAO;

    public Set<Ruleset> getRulesets(){
        return rulesetDAO.findAll();
    }

    public Ruleset addNewRuleset(Ruleset newRuleset){
        return rulesetDAO.save(newRuleset);
    }
}
