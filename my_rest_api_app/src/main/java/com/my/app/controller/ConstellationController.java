package com.my.app.controller;

import com.my.app.dao.ConstellationDAO;
import com.my.app.model.Constellation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constellation")
public class ConstellationController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Constellation> getAllConstellation() {
        List<Constellation> listConstellation = ConstellationDAO.getAllConstellation();
        return listConstellation;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{constName}")
    public Constellation getAllStars(@PathVariable String constName) {
        return ConstellationDAO.getConstel(constName);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Constellation addStar(@RequestBody Constellation constellation) {
        return ConstellationDAO.addConstellation(constellation);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Constellation updateStar(@RequestBody Constellation constellation) {
        return ConstellationDAO.updateConstellation(constellation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{constName}")
    public void deleteStar(@PathVariable String constName) {
        ConstellationDAO.deleteConstellation(constName);
    }
}
