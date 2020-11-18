package com.mastek.idpapi.datatransformation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class DTRService implements DTRAPI{

    @Autowired
    DTRJPADAO DTRDAO;

    public Set<DTR> getDataRules(){
        return DTRDAO.findAll();
    }

    public DTR addNewDataRule(DTR newDataRule){
        return DTRDAO.save(newDataRule);
    }

}
