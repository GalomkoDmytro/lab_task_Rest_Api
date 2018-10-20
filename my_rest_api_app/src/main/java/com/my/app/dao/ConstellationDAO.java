package com.my.app.dao;

import com.my.app.model.Constellation;

import java.util.HashMap;
import java.util.Map;

public class ConstellationDAO {

    private static final Map<String, Constellation> CONSTELLATION_MAP = new HashMap<>();

    static {
        Constellation constellation1
                = new Constellation("Andrómeda", 100, 722);
        Constellation constellation2
                = new Constellation("Ursae Minoris", 125, 1280);
        Constellation constellation3
                = new Constellation("Gemini", 70, 514);

        CONSTELLATION_MAP.put(constellation1.getName(), constellation1);
        CONSTELLATION_MAP.put(constellation2.getName(), constellation2);
        CONSTELLATION_MAP.put(constellation3.getName(), constellation3);
    }

    public static Constellation getConstel(String name) {
        return CONSTELLATION_MAP.get(name);
    }

    public static Constellation addConstellation(Constellation constellation) {
        CONSTELLATION_MAP.put(constellation.getName(), constellation);
        return constellation;
    }

    public static Constellation updateConstellation(Constellation constellation) {
        CONSTELLATION_MAP.put(constellation.getName(), constellation);
        return constellation;
    }

    public static void deleteConstellation(String name) {
        CONSTELLATION_MAP.remove(name);
    }


}
