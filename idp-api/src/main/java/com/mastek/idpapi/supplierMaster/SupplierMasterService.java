package com.mastek.idpapi.supplierMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class SupplierMasterService implements SupplierMasterAPI {

    @Autowired
    SupplierMasterJPADAO supplierDao;

    public Set<SupplierMaster> getSuppliers() {
        return supplierDao.findAll();
    }

    public SupplierMaster addNewSupplier(SupplierMaster newSupplierMaster){
        return supplierDao.save(newSupplierMaster);
    }

}
