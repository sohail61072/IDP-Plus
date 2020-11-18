package com.mastek.idpapi.datatransformation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "data_transformation_rules")
public interface DTRJPADAO extends CrudRepository<DTR, Integer> {

    public Set<DTR> findAll();

}
