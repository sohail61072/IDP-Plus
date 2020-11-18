package com.mastek.idpapi.supplierMaster;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "supplier_master")
public interface SupplierMasterJPADAO extends CrudRepository<SupplierMaster, Integer> {

    public Set<SupplierMaster> findAll();
}
