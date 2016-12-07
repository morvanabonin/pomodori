package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public abstract class BaseDAO<T> implements IBaseDAO<T> {

    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("PomodoriPU");

    public void persist(T entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void update(T entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void updateCompleted(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.createNamedQuery("Task.updateCompleted").setParameter("id",id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(T entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            if (!em.contains(entity)) {
                entity = em.merge(entity);
            }
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<T> findAll(String query) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public List<T> findById(String query, int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery(query).setParameter("id", id).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
}
