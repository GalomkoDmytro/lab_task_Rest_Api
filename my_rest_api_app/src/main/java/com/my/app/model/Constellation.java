package com.my.app.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Constellation {

    String name;
    int brightStars;
    int area; //  square degrees
    Star alpha;

    public Constellation(){}

    public Constellation(String name, int brightStars, int area, Star alpha) {
        this.name = name;
        this.brightStars = brightStars;
        this.area = area;
        this.alpha = alpha;
    }

}
