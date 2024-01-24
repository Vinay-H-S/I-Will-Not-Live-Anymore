package com.xworkz.repo;

import com.xworkz.entity.EmailEntity;
import sun.security.util.PendingException;

import javax.persistence.*;
import java.util.List;

public class EmailRepositoryImpl implements EmailRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(EmailEntity emailEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin the entity");
            et.begin();
            System.out.println("Starting the persist");
            em.persist(emailEntity);
            System.out.println("Persist Success");
            et.commit();
            return emailEntity.getId();
        } catch (PendingException pe) {
            System.out.println("PersistenceException in the save method :" + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("All resources are closed");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<EmailEntity> list) {
        System.out.println("invoking the saveAll the method..");
        EntityManager entityManager = this.emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("begin ET");
            list.forEach(e -> entityManager.persist(e));
            System.out.println(list);
            entityTransaction.commit();
            System.out.println("list saved succesfully");
        } catch (PendingException pe) {
            System.out.println("PersistenceEXception :" + pe.getMessage());
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("closing the resources");
        }
    }

    @Override
    public List<EmailEntity> findAll(String address) {
        System.out.println("invoking the findAll the method..");
        EntityManager entityManager = this.emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("begin ET");
            Query query = entityManager.createNamedQuery("findAllByQuantity");
            query.setParameter("ed", address);
           List<EmailEntity> emailEntities= query.getResultList();
            entityTransaction.commit();
            System.out.println("list saved succesfully");
            return emailEntities;
        } catch (PendingException pe) {
            System.out.println("PersistenceEXception :" + pe.getMessage());
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("closing the resources");
        }

        return EmailRepository.super.findAll(address);
    }
}
