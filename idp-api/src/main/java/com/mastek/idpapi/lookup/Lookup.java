package com.mastek.idpapi.lookup;

import javax.persistence.*;
import javax.ws.rs.FormParam;

@Entity
@Table(name="lookup")
public class Lookup {

    private int lookupId;

    @FormParam("name")
    private String lookupName;
    @FormParam("value")
    private String inputValue;
    @FormParam("transValue")
    private String transformedValue;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getLookupId() {
        return lookupId;
    }

    public void setLookupId(int lookupId) {
        this.lookupId = lookupId;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public String getTransformedValue() {
        return transformedValue;
    }

    public void setTransformedValue(String transformedValue) {
        this.transformedValue = transformedValue;
    }
}
