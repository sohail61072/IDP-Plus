package com.mastek.idpapi.transformationRule;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Set;

@RepositoryRestResource(path = "transformation_rule")
public interface TransformationRuleJPADAO extends CrudRepository<TransformationRule, Integer> {

    public Set<TransformationRule> findAll();
}
