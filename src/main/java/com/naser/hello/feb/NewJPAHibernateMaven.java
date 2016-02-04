package com.naser.hello.feb;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import javax.persistence.*;
import java.util.List;


public class NewJPAHibernateMaven {
    private EntityManager em;

    public NewJPAHibernateMaven(EntityManager manager) {
        this.em = em;
    }

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateDBPersistentUnit");
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Adding a new Customer
//        Cust user = new Cust();
//        user.setFirstName("Mr LionMan2");
//        user.setSurName("Lion2");
//        user.setAddress("17 Chicken Road");
//        em.persist(user);
//        tx.commit();

        // Example Select ALL clause
        System.out.println("Here are all the Customers");
        Query allCustomers = em.createQuery("from Cust");
        List<Cust> allCust = allCustomers.getResultList();

        for (Cust cust : allCust) {
            System.out.println(cust);
        }

        // TOTAL number of Customers
        Query custCount = em.createQuery("select count(*) from Cust");
        System.out.println("The number of Customers in this table are: " + custCount.getSingleResult());
        em.close();


    }
}