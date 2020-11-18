package com.mastek.idpapi.datatransformation;

import javax.persistence.*;
import javax.ws.rs.FormParam;

@Entity
@Table(name="data_transformation_rules")
public class DTR {

    private int ruleId;

    @FormParam("name")
    private String fieldName;
    @FormParam("query")
    private String ruleQuery;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getRuleQuery() {
        return ruleQuery;
    }

    public void setRuleQuery(String ruleQuery) {
        this.ruleQuery = ruleQuery;
    }
}
