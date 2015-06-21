/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author Rafael
 */
public class UsuarioDAO extends GenericDAO<Integer, Usuario>{

    public UsuarioDAO(EntityManager em) {
        super(em);
    }
    
}
