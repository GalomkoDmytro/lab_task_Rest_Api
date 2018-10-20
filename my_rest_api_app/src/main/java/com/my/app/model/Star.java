package com.my.app.model;

import java.util.Objects;

public class Star {

    String name;
    String constellation;

    public Star(){};

    public Star(String name, String constellation) {
        this.name = name;
        this.constellation = constellation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Objects.equals(name, star.name) &&
                Objects.equals(constellation, star.constellation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, constellation);
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", constellation='" + constellation + '\'' +
                '}';
    }
}
