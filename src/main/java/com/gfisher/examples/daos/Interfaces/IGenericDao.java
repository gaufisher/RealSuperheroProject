package com.gfisher.examples.daos.Interfaces;

import com.gfisher.examples.entities.BaseEntity;

import java.util.List;

/**
 * Created by gfisher on 12/23/2015.
 */
public interface IGenericDao<T extends BaseEntity> {
    void add(T t);
    void update(T t);
    void delete(Integer id);
    void delete(T t);
    T getByID(Integer id);
    List<T> getAll();


}
