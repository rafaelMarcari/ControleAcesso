/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaBuilder;

/**
 *
 * @author Rafael
 */
public class UsuarioDAO extends GenericDAO<Usuario>{
    
    public Usuario findByLogin(String login) {
        Usuario u = null;
        try {
            getEntityManager().getTransaction().begin();
            Criteria ct = getSession().createCriteria(Usuario.class);
            ct.add("usuario", login);
            u = (Usuario) ct.uniqueResult();
        } catch (PersistenceException e) {
            e.getMessage();
        }
        getEntityManager().getTransaction().commit();
        return u;
    }
    
    public List<Usuario> tudo() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
        Root<Usuario> rootEntry = cq.from(Usuario.class);
        CriteriaQuery<Usuario> all = cq.select(rootEntry);
        TypedQuery<Usuario> allQuery = getEntityManager().createQuery(all);
        return allQuery.getResultList();
    }
    
}
