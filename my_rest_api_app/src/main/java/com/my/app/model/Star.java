package com.my.app.model;

import javax.persistence.Entity;

import lombok.*;

@Data
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Star {

    String name;
    String constellation;
    long number;

    public Star(){}

    public Star(String name, String constellation, long number) {
        this.name = name;
        this.constellation = constellation;
        this.number = number;
    }
}
