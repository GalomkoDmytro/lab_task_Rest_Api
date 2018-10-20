package com.my.app.model;

import java.util.Objects;

public class Constellation {

    String name;
    int brightStars;
    int area; //  square degrees

    public Constellation(){}

    public Constellation(String name, int brightStars, int area) {
        this.name = name;
        this.brightStars = brightStars;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrightStars() {
        return brightStars;
    }

    public void setBrightStars(int brightStars) {
        this.brightStars = brightStars;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constellation that = (Constellation) o;
        return brightStars == that.brightStars &&
                area == that.area &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brightStars, area);
    }

    @Override
    public String toString() {
        return "Constellation{" +
                "name='" + name + '\'' +
                ", brightStars=" + brightStars +
                ", area=" + area +
                '}';
    }
}
