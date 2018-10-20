package com.my.app.dao;

import com.my.app.model.Constellation;
import com.my.app.model.Star;

import java.util.*;

public class ConstellationDAO {

    private static final Map<String, Constellation> CONSTELLATION_MAP = new HashMap<>();

    static {
        Star star1 = new Star("Polaris", "Ursae Minoris", 1);
        Star star2 = new Star("Sirius", "Canis Major", 2);
        Star star3 = new Star("Proxima Centauri", "Alpha Centauri", 3);

        Constellation constellation1
                = new Constellation("Andrómeda", 100, 722, star1);
        Constellation constellation2
                = new Constellation("Ursae Minoris", 125, 1280, star2);
        Constellation constellation3
                = new Constellation("Gemini", 70, 514, star3);

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

    public static List<Constellation> getAllConstellation() {
        Collection<Constellation> c = CONSTELLATION_MAP.values();
        List<Constellation> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }
}
