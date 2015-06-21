/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rafael
 * 
 */
public class ConnectionDB {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public EntityManager getConnection(){
        if (em == null){
                emf  = Persistence.createEntityManagerFactory("connBanco");
                em  = emf.createEntityManager();
        }	

        return em;	
    }
}
