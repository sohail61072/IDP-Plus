package com.mastek.idpapi.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@Component
public class SourceService implements SourceAPI {

    @Autowired
    SourceJPADAO sourceDao;

    public Set<Source> getSources(){
        return sourceDao.findAll();
    }

    public Source addNewSource(@RequestBody Source newSource){
        return sourceDao.save(newSource);
    }

    public Source updateSource(@RequestBody Source newSource){
        return sourceDao.save(newSource);
    }
}
