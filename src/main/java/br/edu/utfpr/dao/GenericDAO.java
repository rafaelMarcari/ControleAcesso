/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Rafael
 * @param <T>
 */
public abstract class GenericDAO<T> implements Serializable {
    
    private EMF emf;
    private final EntityManager em;
    
    private Class<T> entityClass;

    public GenericDAO(EntityManager em) {
        this.em = em;
    }
    
    public void save(T entity) {
        em.persist(entity);
    }
    
    public void delete(T entity) {
        em.remove(entity);
    }
    
    public T update(T entity) {
        return em.merge(entity);
    }
    
    public T findById(Long id) {
        return em.find(entityClass, id);
    }
    
    public List<T> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }
    
}
