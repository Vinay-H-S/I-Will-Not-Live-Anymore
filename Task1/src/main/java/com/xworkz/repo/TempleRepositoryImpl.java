package com.xworkz.repo;

import com.xworkz.entity.TempleEntity;
import com.xworkz.util.EMFUtil;
import lombok.extern.slf4j.Slf4j;
import sun.security.util.PendingException;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Slf4j
public class TempleRepositoryImpl implements TempleRepository {

    private  EntityManagerFactory emf = EMFUtil.getManagerFactory();

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
            return list;
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
            TempleEntity ent = (TempleEntity) obj;
            et.commit();
            System.out.println("list saved successfully");
            return ent;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }
        return TempleRepository.super.findById(id);
    }

    @Override
    public List<TempleEntity> findByIdAndMainGOd(int id, String mainGod) {
        System.out.println("invoking the findByIdAndMainGOd method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findByIdAndMainGod");
            query.setParameter("ti", id);
            query.setParameter("tm", mainGod);
            List<TempleEntity> obj = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return obj;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }

        return TempleRepository.super.findByIdAndMainGOd(id, mainGod);
    }

    @Override
    public long findTotal() {
        System.out.println("invoking the findTotal method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findTotal");
            Object obj = query.getSingleResult();
            long total = (long) obj;
            et.commit();
            System.out.println("list saved successfully");
            return total;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }
        return 0;
    }

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        System.out.println("invoking the findTempleByMaxEntryFee method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findTempleByMaxEntryFee");
            Object obj = query.getSingleResult();
            TempleEntity tem = (TempleEntity) obj;
            et.commit();
            System.out.println("list saved successfully");
            return tem;
        } catch (PendingException pe) {
            System.err.println("PersistenceEXception :" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
            System.out.println("closing the resources");
        }
        return null;
    }

    @Override
    public void updateLocationByName(String location, String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query1 = em.createNamedQuery("findAll");
            query1.setParameter("templeName", name);
            Object obj = query1.getSingleResult();
            TempleEntity list = (TempleEntity) obj;
            if (list != null) {
                list.setLocation(location);
                list.setName(name);
                em.merge(list);
                et.commit();
                System.out.println("Data is updated");
            }
        } catch (PersistenceException pe) {
            et.rollback();
            System.out.println("PersistenceException in updateLocationByName method");
        } finally {
            em.close();
            System.out.println("Closing the open resources");
        }

        TempleRepository.super.updateLocationByName(location, name);
    }

    @Override
    public void upadteEntryFeeByName(double fee, String name) {
        System.out.println("invoking the updateEntryFeeName method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAll");
            query.setParameter("templeName", name);
            Object obj = query.getSingleResult();
            TempleEntity list = (TempleEntity) obj;
            if (list != null) {
                list.setEntryFee(fee);
                list.setName(name);
                em.merge(list);
                et.commit();
                System.out.println("Data is Upadted");
            }

        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in updateLocationByName method");
            et.rollback();
        } finally {
            em.close();
            System.out.println("Closing the Resources");
        }
        TempleRepository.super.upadteEntryFeeByName(fee, name);
    }

    @Override
    public void updateLocationAndDimensionById(String location, String dimension, int id) {
        System.out.println("invoking the updateLocationAndDimensionById method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("templeId", id);
            Object obj = query.getSingleResult();
            TempleEntity list = (TempleEntity) obj;
            if (list != null) {
                list.setLocation(location);
                list.setDimension(dimension);
                em.merge(list);
                et.commit();
                System.out.println("Data is Upadted");
            }

        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in updateLocationByName method");
            et.rollback();
        } finally {
            em.close();
            System.out.println("Closing the Resources");
        }
        TempleRepository.super.updateLocationAndDimensionById(location, dimension, id);
    }

    @Override
    public void updateAllVipEntry(boolean vipEntry, List<Integer> ids) {
        System.out.println("invoking the updateAllVipEntry method");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("begin ET");
            Query query = em.createNamedQuery("updateAllVipEntry");
            ids.forEach(id -> {
                et.begin();
                query.setParameter("templeId", id);
                Object obj = query.getSingleResult();
                TempleEntity list = (TempleEntity) obj;
                if (list != null) {
                    list.setVipEntry(vipEntry);
                    list.setId(id);
                    em.merge(list);
                    et.commit();
                    System.out.println("Data is updated");
                }
            });
        } catch (PersistenceException pe) {
            System.err.println("PersistenceException in updateLocationByName method");
            et.rollback();
        } finally {
            em.close();
            System.out.println("Closing the Resources");
        }
        TempleRepository.super.updateAllVipEntry(vipEntry, ids);
    }

    @Override
    public void deleteByName(String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("begin ET");
            Query query = em.createNamedQuery("findAll");
            query.setParameter("templeName", name);
            Object obj = query.getSingleResult();
            TempleEntity list = (TempleEntity) obj;
            System.out.println(list);
            if (list != null) {
                list.setName(name);
                em.remove(list);
                et.commit();
                System.out.println("Data is deleted successfully");
            }
        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in deleteByName");
        } finally {
            em.close();
            System.out.println("Closing the open resources");
        }

        TempleRepository.super.deleteByName(name);
    }
}
