package com.mastek.idpapi.supplierMaster;

import org.springframework.web.bind.annotation.RequestBody;

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
    @Consumes(MediaType.APPLICATION_JSON)
   public SupplierMaster addNewSupplier(@RequestBody SupplierMaster newSupplier);
}
