/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rafael
 * 
 */
public class EMF {
    
    private static EMF instance = null;
    private static EntityManagerFactory factory = null;
    
    private EMF() {}

    public static EMF getInstance() {
        if(instance==null) {
            instance = new EMF();
        }
        return instance;
    }
    
    public EntityManager createEntityManager(){
        if(factory==null) {
            factory = Persistence.createEntityManagerFactory("default");
        }
        return factory.createEntityManager();
    }
}
