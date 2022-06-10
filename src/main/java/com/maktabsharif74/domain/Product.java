package com.maktabsharif74.domain;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Product extends Base{
    private int Unit;
    private int Price;

    public Product() {

    }

    public Product(int id, int unit, int price) {
        super(id);
        Unit = unit;
        Price = price;
    }

    public int getUnit() {
        return Unit;
    }

    public void setUnit(int unit) {
        Unit = unit;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                super.toString()+
                "Unit=" + Unit +
                ", Price=" + Price +
                '}';
    }
}
