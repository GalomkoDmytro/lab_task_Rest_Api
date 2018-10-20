package com.my.app.service;

import com.my.app.dao.ConstellationDAO;
import com.my.app.model.Constellation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/constellation")
public class ConstellationService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Constellation> getEmployees_JSON() {
        List<Constellation> listStar = ConstellationDAO.getAllConstellation();
        return listStar;
    }

    @GET
    @Path("/{constName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Constellation getEmployee(@PathParam("constName") String constName) {
        return ConstellationDAO.getConstel(constName);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Constellation addStar(Constellation constellation) {
        return ConstellationDAO.addConstellation(constellation);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Constellation updateStar(Constellation constellation) {
        return ConstellationDAO.updateConstellation(constellation);
    }

    @DELETE
    @Path("/{constNum}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteStar(@PathParam("constNum") String constNum) {
        ConstellationDAO.deleteConstellation(constNum);
    }
}
