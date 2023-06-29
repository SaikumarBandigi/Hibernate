package com.javatpoint;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Collection;
import java.util.List;

public class Store {
    public static void main(String[] args) {

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

//        Alien a1 = new Alien();
//        a1.setAid(1);
//        a1.setAname("Navin");
//
//        Alien a2 = new Alien();
//        a2.setAid(2);
//        a2.setAname("Rahul");
//
//        Alien a3 = new Alien();
//        a3.setAid(3);
//        a3.setAname("Mayank");
//
//
//        Laptop l1 = new Laptop();
//        l1.setLid(101);
//        l1.setBrand("Dell");
//        l1.setPrice(1000);
//
//        Laptop l2 = new Laptop();
//        l2.setLid(102);
//        l2.setBrand("Apple");
//        l2.setPrice(2000);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(103);
//        l3.setBrand("Asus");
//        l3.setPrice(800);
//
//
//        Laptop l4 = new Laptop();
//        l4.setLid(104);
//        l4.setBrand("Acer");
//        l4.setPrice(1500);
//
//        Laptop l5 = new Laptop();
//        l5.setLid(105);
//        l5.setBrand("Samsung");
//        l5.setPrice(1400);
//
//        l1.setAlien(a1);
//        l2.setAlien(a3);
//        l3.setAlien(a1);
//        l4.setAlien(a3);
//        l5.setAlien(a1);
//
//        a1.getLaptop().add(l1);
//        a3.getLaptop().add(l2);
//        a1.getLaptop().add(l3);
//        a3.getLaptop().add(l4);
//        a1.getLaptop().add(l5);
//
//
//        session.persist(a1);
//        session.persist(a2);
//        session.persist(a3);


        //   Alien a1 = session.get(Alien.class, 1);


        Person p1 = new Person();
        p1.setPname("Sai Kumar Bandigi");

        Person p2 = new Person();
        p2.setPname("Komal Namaji");


        Address a1 = new Address();
        a1.setCity("Narayanpet");
        a1.setState("Telangana");


        Address a2 = new Address();
        a2.setCity("Bengaluru");
        a2.setState("Karnataka");


        a1.setPerson(p1);
        a2.setPerson(p2);

        p1.setAddress(a1);
        p2.setAddress(a2);

        session.persist(p1);
        session.persist(p2);


        t.commit();
        session.close();
        //System.out.println("success");

    }
}
