package com.xworkz.boot;

import com.xworkz.boot.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner2 {

    public static void main(String[] args) {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
      EntityManager em=emf.createEntityManager();
//     EntityTransaction et=em.getTransaction();


       ToyEntity entityFromDB=em.find(ToyEntity.class,1);
        System.out.println("Entity Data is found :"+entityFromDB);



//        ToyEntity toyEntity=new ToyEntity(1,"Spider","Red",350,"Silicon");
//        et.begin();
//        System.out.println("Entity Transaction is begin()");
//        em.persist(toyEntity);
//        System.out.println("Entity Transaction is Committed..!!!");
//        et.commit();

        emf.close();
        em.close();

    }

}
