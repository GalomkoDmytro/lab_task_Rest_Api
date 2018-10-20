package com.my.app.dao;

import com.my.app.model.Star;

import java.util.*;

public class StarDAO {

    private static final Map<String, Star> STAR_MAP = new HashMap<>();

    static {
        Star star1 = new Star("Polaris", "Ursae Minoris", 1);
        Star star2 = new Star("Sirius", "Canis Major", 2);
        Star star3 = new Star("Proxima Centauri", "Alpha Centauri", 3);

        STAR_MAP.put(String.valueOf(star1.getNumber()), star1);
        STAR_MAP.put(String.valueOf(star2.getNumber()), star2);
        STAR_MAP.put(String.valueOf(star3.getNumber()), star3);
    }

    public static Star getStar(String starNumber) {
        return STAR_MAP.get(starNumber);
    }

    public static Star addStar(Star star) {
        STAR_MAP.put(String.valueOf(star.getNumber()), star);
        return star;
    }

    public static Star updateStar(Star star) {
        STAR_MAP.put(String.valueOf(star.getNumber()), star);
        return star;
    }

    public static void deleteStar(Star star) {
        STAR_MAP.remove(star);
    }

    public static List<Star> getAllStar() {
        Collection<Star> c = STAR_MAP.values();
        List<Star> list = new ArrayList<Star>();
        list.addAll(c);
        return list;
    }
}
