package com.xworkz.repo;

import com.xworkz.entity.TempleEntity;
import sun.security.util.PendingException;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TempleEntity templeEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            em.persist(templeEntity);
            et.commit();
            System.out.println("TempleEntity Saved Successfully");
            return templeEntity.getId();

        } catch (PersistenceException pe) {
            et.rollback();
            System.out.println("PersistenceException in the templeEntity");
        } finally {
            em.close();
            System.out.println("Resources are closed..");
        }

        return null;
    }

    @Override
    public void saveAll(List<TempleEntity> list) {
        System.out.println("invoking the saveAll the method..");
        EntityManager entityManager = this.emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("begin ET");
            list.forEach(e -> entityManager.persist(e));
            entityTransaction.commit();
            System.out.println("list saved succesfully");
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("closing the resources");
        }
    }


    @Override
    public List<TempleEntity> findAllByLocation(String name) {
        System.out.println("invoking the findAllByLocation method..");
        EntityManager entityManager = this.emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("begin ET");
            Query query = entityManager.createNamedQuery("findAllByLocation");
            query.setParameter("tl", name);
            List<TempleEntity> list = query.getResultList();
            entityTransaction.commit();
            System.out.println("list saved succesfully");
            return list;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("closing the resources");
        }


        return TempleRepository.super.findAllByLocation(name);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double fee) {
        System.out.println("invoking the findAllByEntryFeeGreaterThan method..");
        EntityManager entityManager = this.emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("begin ET");
            Query query = entityManager.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("tf", fee);
            List<TempleEntity> list = query.getResultList();
            entityTransaction.commit();
            System.out.println("list saved succesfully");
            return list;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            System.out.println("closing the resources");
        }
        return TempleRepository.super.findAllByEntryFeeGreaterThan(fee);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        System.out.println("invoking the findAllByEntryFeeBetween method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("sf", startFee);
            query.setParameter("ef", endFee);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }

        return TempleRepository.super.findAllByEntryFeeBetween(startFee, endFee);
    }

    @Override
    public List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date) {
        System.out.println("invoking the findAllByInaguratedDateGreaterThan method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAllByInaguratedDateGreaterThan");
            query.setParameter("td", date);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }
        return TempleRepository.super.findAllByInaguratedDateGreaterThan(date);
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
        System.out.println("invoking the findAllByMainGodAndLocation method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("tm", mainGod);
            query.setParameter("tl", location);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }

        return TempleRepository.super.findAllByMainGodAndLocation(mainGod, location);
    }

    @Override
    public TempleEntity findById(int id) {
        System.out.println("invoking the findById method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findById");
            query.setParameter("tid", id);
            Object obj = query.getSingleResult();
            Object list = obj;
            et.commit();
            System.out.println("list saved successfully");
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }
        return TempleRepository.super.findById(id);
    }
}
