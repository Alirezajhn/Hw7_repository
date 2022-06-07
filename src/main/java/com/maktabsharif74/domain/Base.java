package com.maktabsharif74.domain;

import javax.persistence.Id;

public class Base {
    @Id
    private int id;

    public Base() {

    }

    public Base(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }
}
