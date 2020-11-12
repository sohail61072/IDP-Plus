package com.mastek.idpapi.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class SourceService implements SourceAPI {

    @Autowired
    SourceJPADAO sourceDao;

    public Set<Source> getSources(){
        return sourceDao.findAll();
    }
}
