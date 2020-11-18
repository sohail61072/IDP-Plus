package com.mastek.idpapi.ruleset;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "ruleset")
public interface RulesetJPADAO extends CrudRepository<Ruleset, Integer> {

    public Set<Ruleset> findAll();

}
