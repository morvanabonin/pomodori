package dao;

import entity.Task;
import util.ServiceManager;
import javax.persistence.EntityManager;


/**
 * Created by morvana on 01/12/16.
 */
public class TaskDao {

    public void insert(Task task) {
        EntityManager manager= ServiceManager.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(task);
        manager.getTransaction().commit();
        manager.close();
    }
}
