/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.singleton.ConnectionDB;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Rafael
 * @param <PK>
 * @param <T>
 */

public class GenericDAO<PK, T> extends ConnectionDB {
    private EntityManager em;
 
    public GenericDAO(EntityManager em) {
        this.em = em;
    }
 
    public T getById(PK pk) {
        return (T) em.find(getTypeClass(), pk);
    }
 
    public void save(T entity) {
        em.persist(entity);
    }
 
    public void update(T entity) {
        em.merge(entity);
    }
 
    public void delete(T entity) {
        em.remove(entity);
    }
 
    public List<T> findAll() {
        return em.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }
 
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }
}