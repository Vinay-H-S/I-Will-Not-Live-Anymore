package com.xworkz.repo;

import com.xworkz.entity.ConditionerEntity;
import com.xworkz.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository {

    private final EntityManagerFactory emf = EMFUtil.getManagerFactory();

    @Override
    public void save(ConditionerEntity entity) {
        System.out.println("invoking the save method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            em.persist(entity);
            et.commit();
            System.out.println("Data is committed");
        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in save method");
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
    }

    @Override
    public void saveAll(List<ConditionerEntity> list) {
        System.out.println("invoking the saveAll method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            list.forEach(conditioner -> em.persist(conditioner));
            et.commit();
            System.out.println("Data is committed");
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method");
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
    }

    @Override
    public void updateLiquidVolumeByBrand(String brand, int liquidVolume) {
        System.out.println("invoking the updateLiquidVolumeByBrand method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("updateLiquidVolumeByBrand");
            query.setParameter("bn", brand);
            Object obj = query.getSingleResult();
            ConditionerEntity entity = (ConditionerEntity) obj;
            if (entity != null) {
                entity.setLiquidVolume(liquidVolume);
                em.merge(entity);
            }
            et.commit();
            System.out.println("Data is committed");
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }

        ConditionerRepository.super.updateLiquidVolumeByBrand(brand, liquidVolume);
    }

    @Override
    public void updateHairTypeByBrand(String brand, String hairType) {
        System.out.println("invoking the updateHairTypeByBrand method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("updateLiquidVolumeByBrand");
            query.setParameter("bn", brand);
            Object obj = query.getSingleResult();
            ConditionerEntity entity = (ConditionerEntity) obj;
            if (entity != null) {
                entity.setHairType(hairType);
                em.merge(entity);
            }
            et.commit();
            System.out.println("Data is committed and Updated in database");
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
        ConditionerRepository.super.updateHairTypeByBrand(brand, hairType);
    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {
        System.out.println("invoking the findAllByBrand method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("updateLiquidVolumeByBrand");
            query.setParameter("bn", brand);
            List<ConditionerEntity> list = query.getResultList();
            et.commit();
            System.out.println("Data is committed");
            return list;
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
        return ConditionerRepository.super.findAllByBrand(brand);
    }

    @Override
    public List<ConditionerEntity> findAllHairType(String hairType) {
        System.out.println("invoking the findAllHairType method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAllByHairType");
            query.setParameter("ht", hairType);
            List<ConditionerEntity> list = query.getResultList();
            et.commit();
            System.out.println("Data is committed");
            return list;
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
        return ConditionerRepository.super.findAllHairType(hairType);
    }

    @Override
    public List<ConditionerEntity> findScentById(int id) {
        System.out.println("invoking the findScentById method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findScentById");
            query.setParameter("cid", id);
            List<ConditionerEntity> list = query.getResultList();
            et.commit();
            System.out.println("Data is committed");
            return list;
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
        return ConditionerRepository.super.findScentById(id);
    }

    @Override
    public List<Integer> getAllSize() {
        System.out.println("invoking the getAllSize method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("getAllSize");
            List<Integer> entity = query.getResultList();
            et.commit();
            System.out.println("Data is commited and all size found");
            return entity;
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }
        return ConditionerRepository.super.getAllSize();
    }

    @Override
    public List<String> getAllBrand() {
        System.out.println("invoking the getAllBrand method");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("getAllBrand");
            List<String> entity = query.getResultList();
            et.commit();
            System.out.println("Data is commited and all size found");
            return entity;
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in save method" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the open resorces");
        }

        return ConditionerRepository.super.getAllBrand();
    }
}
