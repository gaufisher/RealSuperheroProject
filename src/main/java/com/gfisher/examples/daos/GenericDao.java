package com.gfisher.examples.daos;

import com.gfisher.examples.daos.Interfaces.IGenericDao;
import com.gfisher.examples.entities.BaseEntity;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by gfisher on 12/23/2015.
 */
@Transactional
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public abstract class GenericDao<T extends BaseEntity> implements IGenericDao<T> {

    @PersistenceContext
    protected EntityManager em;
    private String table;
    protected Class<T> entity;

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }

    public void setTable(String table) {
        this.table=table;
    }

    public GenericDao(Class<T> entity) {
        this.table = entity.getSimpleName();
        this.entity = entity;
    }

    public GenericDao() {}

    public EntityManager getEm() { return em; }

    public void setEM(EntityManager em) {
        this.em = em;
    }

    private String selectQuery() {
        return "Select x from " + table;
    }

    public T getByID(Integer id) {
        return em.createQuery(selectQuery() +" x where x.id = :id", entity).setParameter("id",id).getSingleResult();
    }

    public List<T> getAll() {
        return (List<T>) em.createQuery(selectQuery() + " x", entity).getResultList();
    }

    public void add(T t) {
        em.persist(t);
    }

    public void update(T t) {
        em.merge(t);
    }

    public void delete(Integer id) {
        em.remove(getByID(id));
    }

    public void delete(T t) {
        em.remove(t);
    }
}
