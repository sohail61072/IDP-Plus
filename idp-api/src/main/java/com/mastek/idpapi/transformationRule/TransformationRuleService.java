package com.mastek.idpapi.transformationRule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@Component
public class TransformationRuleService implements TransformationRuleAPI {

    @Autowired
    TransformationRuleJPADAO transDao;

    public Set<TransformationRule> getTransformationRule() {
        return transDao.findAll();
    }

    public TransformationRule addNewTransformationRule(@RequestBody TransformationRule newTransRule) {
        return transDao.save(newTransRule);
    }
}
