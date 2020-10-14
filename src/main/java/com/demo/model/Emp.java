package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
    @Id
    public String id;
    public String name;

    public Emp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
