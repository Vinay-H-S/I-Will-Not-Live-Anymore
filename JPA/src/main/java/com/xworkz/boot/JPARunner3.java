package com.xworkz.boot;

import com.xworkz.boot.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner3 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        System.out.println("TX is begin()");
       ToyEntity entityData=em.find(ToyEntity.class,1);
       if (entityData != null){
           entityData.setName("Iron Man");
           em.merge(entityData);
           System.out.println("Entity Data is Updated");
//           em.remove(entityData);
//           System.out.println("Entity is Deleted");
       }else{
           System.out.println("Entity Data Can't Updated");
       }
       et.commit();
       emf.close();
       em.close();

    }

}
