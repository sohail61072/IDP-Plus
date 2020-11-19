package com.mastek.idpapi.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@Component
public class LookupService implements LookupAPI{

    @Autowired
    LookupJPADAO lookupDao;

    public Set<Lookup> getLookups(){
        return lookupDao.findAll();
    }

    public Lookup addNewLookup(@RequestBody Lookup newLookup){
        return lookupDao.save(newLookup);
    }

}
