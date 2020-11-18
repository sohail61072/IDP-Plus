package com.mastek.idpapi.transformationRule;

import javax.persistence.*;
import javax.ws.rs.FormParam;

@Entity
@Table(name="transformation_rule")
public class TransformationRule {

        private int transformationRuleId;

        @FormParam("rule")
        private String transformationRule;
        @FormParam("system")
        private String targetSystem;
        @FormParam("field")
        private String fieldName;
        @FormParam("level")
        private String level;
        @FormParam("ruleQuery")
        private String ruleQuery;
        @FormParam("IDPField")
        private String IdpField;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getTransformationRuleId() {
        return transformationRuleId;
    }

    public void setTransformationRuleId(int transformationRuleId) {
        this.transformationRuleId = transformationRuleId;
    }

    public String getTransformationRule() {
        return transformationRule;
    }

    public void setTransformationRule(String transformationRule) {
        this.transformationRule = transformationRule;
    }

    public String getTargetSystem() {
        return targetSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getIdpField() {
        return IdpField;
    }

    public void setIdpField(String IDPField) {
        this.IdpField = IDPField;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRuleQuery() {
        return ruleQuery;
    }

    public void setRuleQuery(String ruleQuery) {
        this.ruleQuery = ruleQuery;
    }
}
