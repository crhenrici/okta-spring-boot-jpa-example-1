package com.okta.springbootjpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Kayak {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private final String name;
    private String owner;
    private Number value;
    private String makeModel;

    public Kayak(String name, String owner, Number value, String makeModel) {
        this.name = name;
        this.owner = owner;
        this.value = value;
        this.makeModel = makeModel;
    }
}