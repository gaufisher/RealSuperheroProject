package com.gfisher.examples.webcontroller.IGenericController;

import com.gfisher.examples.entities.BaseEntity;

import java.util.List;

/**
 * Created by gfisher on 12/24/2015.
 */
public interface IGenericController<T extends BaseEntity> {
    void add(T t);
    void update(T t);
    void delete(Integer id);
    List<T> getAll();
}
