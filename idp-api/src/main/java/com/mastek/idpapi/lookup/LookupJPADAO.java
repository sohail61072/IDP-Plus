package com.mastek.idpapi.lookup;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "lookup")
public interface LookupJPADAO extends CrudRepository<Lookup, Integer> {

    public Set<Lookup> findAll();
}
