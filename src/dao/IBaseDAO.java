package dao;

import java.util.List;

public interface IBaseDAO<T> {

    void persist(T entity);
    void update(T entity);
    void delete(T entity);
    List<T> findAll(String query);
    List<T> findById(String query, int id);
}
