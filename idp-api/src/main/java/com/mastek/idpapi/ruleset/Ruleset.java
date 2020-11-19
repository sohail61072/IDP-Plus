package com.mastek.idpapi.ruleset;

import javax.persistence.*;
import javax.ws.rs.FormParam;

@Entity
@Table(name="ruleset")
public class Ruleset {

    private int rulesetId;

    private String ruleSet;
    private String level;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(int rulesetId) {
        this.rulesetId = rulesetId;
    }

    public String getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(String ruleSet) {
        this.ruleSet = ruleSet;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
