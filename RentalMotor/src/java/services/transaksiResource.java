/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import helper.transaksiHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Transaksi;

/**
 * REST Web Service
 *
 * @author Bernadette Chrestella - bernadettechrestella@gmail.com
 */
@Path("transaksi")
public class transaksiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of transaksiResource
     */
    public transaksiResource() {
    }

    /**
     * Retrieves representation of an instance of services.transaksiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of transaksiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTransaksi(){
        transaksiHelper helper = new transaksiHelper();
        List<Transaksi> list = helper.getTransaksi();
        Gson gson = new Gson();
        
        return Response.status(200)
                .entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "2")
                .header("Access-Preflight-Maxage", "2")
                .build();
    }
    
    @POST
    @Path("addPenyewa")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewPenyewa(String data){
        Gson gson = new Gson();
        Transaksi transaksi = gson.fromJson(data, Transaksi.class);
        transaksiHelper helper = new transaksiHelper();
        helper.addNewTransaksi(0, transaksi.getPenyewa(), transaksi.getLamaSewa(), transaksi.getTanggalMulai(), transaksi.getTanggalSelesai(), 
                transaksi.getJamPengantaran(), transaksi.getJamPenjemputan(), transaksi.getJenisMotor(), transaksi.getWarna(), transaksi.getMotor(), transaksi.getStatus());
        return Response
                .status(200)
                .entity(transaksi)
                .build();
    }
}
