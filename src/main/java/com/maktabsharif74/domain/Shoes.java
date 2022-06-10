package com.maktabsharif74.domain;

import javax.persistence.Entity;

import javax.persistence.Table;


@Entity
@Table(name = Shoes.TABLE_NAME)
public class Shoes extends Product {
    public static final String TABLE_NAME = "shoes";
    private String sizeShoes;
    private String color;
    private String typeShoes;

    //shoes(product) to basket : many to one
    public Shoes() {
    }

    public Shoes(int id, int unit, int price, String sizeShoes, String color, String typeShoes) {
        super(id, unit, price);
        this.sizeShoes = sizeShoes;
        this.color = color;
        this.typeShoes = typeShoes;
    }

    public String getSizeShoes() {
        return sizeShoes;
    }

    public void setSizeShoes(String sizeShoes) {
        this.sizeShoes = sizeShoes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeShoes() {
        return typeShoes;
    }

    public void setTypeShoes(String typeShoes) {
        this.typeShoes = typeShoes;
    }


    @Override
    public String toString() {
        return "Shoes{" +
                super.toString() +
                "sizeShoes='" + sizeShoes + '\'' +
                ", color='" + color + '\'' +
                ", typeShoes='" + typeShoes + '\'' +
                '}';
    }
}
