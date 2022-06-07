package com.maktabsharif74.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import static com.maktabsharif74.domain.ReadableItems.TABLE_NAME;

@Entity
@Table(name = ReadableItems.TABLE_NAME)
public class ReadableItems extends Product {
    public static final String TABLE_NAME = "ReadableItems";

    private String title;
    private String brief;
    private String content;
    private String publisher;
    private String typeItems;

    //ReadableItems(product) to basket : many to one
    public ReadableItems() {

    }

    public ReadableItems(int id, int unit, int price, String title, String brief, String content, String publisher, String typeItems) {
        super(id, unit, price);
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.publisher = publisher;
        this.typeItems = typeItems;
    }

    public String getTypeItems() {
        return typeItems;
    }

    public void setTypeItems(String typeItems) {
        this.typeItems = typeItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "ReadableItems{" +
                super.toString() +
                "title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", content='" + content + '\'' +
                ", publisher='" + publisher + '\'' +
                ", typeItems='" + typeItems + '\'' +
                '}';
    }
}
