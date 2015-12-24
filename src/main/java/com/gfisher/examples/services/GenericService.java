package com.gfisher.examples.services;

import com.gfisher.examples.daos.Interfaces.IGenericDao;
import com.gfisher.examples.entities.BaseEntity;
import com.gfisher.examples.services.Interfaces.IGenericService;

import java.util.List;

/**
 * Created by gfisher on 12/23/2015.
 */
public class GenericService<T extends BaseEntity> implements IGenericService<T> {
    protected IGenericDao dao;

    public GenericService(IGenericDao dao) {
        this.dao = dao;
    }

    public GenericService() {}

    public List<T> getAll() {
        return dao.getAll();
    }

    public T getByID(Integer id) {
        return (T) dao.getByID(id);
    }

    public void add(T t) {
        dao.add(t);
    }

    public void update(T t) {
        dao.update(t);
    }

    public void delete(Integer id) {
        dao.delete(id);
    }

    public void delete(T t) {
        dao.delete(t);
    }
}
