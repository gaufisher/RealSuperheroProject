package com.gfisher.examples.services.Interfaces;

import com.gfisher.examples.entities.BaseEntity;

import java.util.List;

/**
 * Created by gfisher on 12/24/2015.
 */
public interface IGenericService <T extends BaseEntity>{
    void add(T t);
    void update(T t);
    void delete(Integer id);
    List<T> getAll();
}
