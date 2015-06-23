/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Arquivo;
import javax.persistence.EntityManager;

/**
 *
 * @author Rafael
 */
public class ArquivoDAO extends GenericDAO<Integer, Arquivo>{

    protected EntityManager em;

    public ArquivoDAO(EntityManager em) {
        super(em);
    }
    
    
}
