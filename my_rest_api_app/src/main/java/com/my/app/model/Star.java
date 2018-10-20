package com.my.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "star")
@XmlAccessorType(XmlAccessType.FIELD)
public class Star {

    String name;
    String constellation;
    long number;

    public Star(){};

    public Star(String name, String constellation, long number) {
        this.name = name;
        this.constellation = constellation;
        this.number = number;
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Objects.equals(name, star.name) &&
                Objects.equals(constellation, star.constellation)
                &&
                Objects.equals(number, star.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, constellation, number);
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", constellation='" + constellation + '\'' +
                ", number=" + number +
                '}';
    }
}
