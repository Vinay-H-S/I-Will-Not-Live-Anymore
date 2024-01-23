package com.xworkz.repo;

import com.xworkz.entity.EmailEntity;
import sun.security.util.PendingException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmailRepositoryImpl implements EmailRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(EmailEntity emailEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            System.out.println("Begin the entity");
            et.begin();
            System.out.println("Starting the persist");
            em.persist(emailEntity);
            System.out.println("Persist Success");
            et.commit();
            return emailEntity.getId();
        }catch (PendingException pe){
            System.out.println("PersistenceException in the save method :"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("All resources are closed");
            em.close();
        }
        return null;
    }
}
