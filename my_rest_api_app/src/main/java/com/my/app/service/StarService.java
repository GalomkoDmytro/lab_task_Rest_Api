package com.my.app.service;

import com.my.app.dao.StarDAO;
import com.my.app.model.Star;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/star")
public class StarService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Star> getEmployees_JSON() {
        List<Star> listStar = StarDAO.getAllStar();
        return listStar;
    }

    @GET
    @Path("/{starNumber}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Star getEmployee(@PathParam("starNumber") String starNumber) {
        return StarDAO.getStar(starNumber);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Star addStar(Star star) {
        return StarDAO.addStar(star);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Star updateStar(Star star) {
        return StarDAO.updateStar(star);
    }

    @DELETE
    @Path("/{starNumber}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteStar(@PathParam("starNumber") String starNumber) {
        StarDAO.deleteStar(starNumber);
    }

}
