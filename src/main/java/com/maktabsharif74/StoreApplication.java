package com.maktabsharif74;

import com.maktabsharif74.util.HibernateUtil;

import javax.persistence.EntityManagerFactory;

public class StoreApplication {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();
        System.out.println("done");

    }
}
