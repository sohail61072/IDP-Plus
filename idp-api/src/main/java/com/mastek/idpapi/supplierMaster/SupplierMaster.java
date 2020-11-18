package com.mastek.idpapi.supplierMaster;

import javax.persistence.*;
import javax.ws.rs.FormParam;

@Entity
@Table(name="supplier_master")
public class SupplierMaster {
    private int supplierId;

    @FormParam("name")
    private String supplierName;
    @FormParam("taxID")
    private String taxID;
    @FormParam("type")
    private String supplierType;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getTaxID() {
        return taxID;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
}
