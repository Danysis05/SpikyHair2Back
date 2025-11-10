package com.spikhair2.spikyhair2.services.DAO;

import java.util.List;

public interface Idao<T, ID> {
    List<T> getAll();
    T getById(ID id);
    T save(T entity);
    T update(ID id, T entity);
    void delete(ID id);
    long count();
}
