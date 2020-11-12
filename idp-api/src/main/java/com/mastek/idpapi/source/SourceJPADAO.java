package com.mastek.idpapi.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "manage_sources")
public interface SourceJPADAO extends CrudRepository<Source, Integer> {

    public Set<Source> findAll();
}
