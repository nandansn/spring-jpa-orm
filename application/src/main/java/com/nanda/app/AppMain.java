package com.nanda.app;


import com.nanda.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        // Define your JPQL query to retrieve User objects
        String jpql = "SELECT u FROM USER u";
        Query query = em.createQuery(jpql);

        // Execute the query and get the results as a List<User>
        List<User> users = query.getResultList();
        users.forEach(System.out::println);

        em.close();
        emf.close();

    }
}
