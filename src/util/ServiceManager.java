/**
 * Entity to generate the task table in database
 * @author Morvana Bonin <morvanabonin@gmail.com>
 * @since 2016
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * F
 */
public class ServiceManager {

    public static  EntityManagerFactory emf;
    static {emf = Persistence.createEntityManagerFactory("PomodoriPU");}

    public static EntityManager getEntityManager() {
        emf = Persistence.createEntityManagerFactory("PomodoriPU");
        return emf.createEntityManager();
    }

    public static void close() {
        emf.close();
    }
}