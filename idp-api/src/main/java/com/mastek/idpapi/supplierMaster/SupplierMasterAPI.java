package com.mastek.idpapi.supplierMaster;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/supplier/")
public interface SupplierMasterAPI {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Set<SupplierMaster> getSuppliers();

    @POST
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
   public SupplierMaster addNewSupplier(@BeanParam SupplierMaster newSupplier);
}
