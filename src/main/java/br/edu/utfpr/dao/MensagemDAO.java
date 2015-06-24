/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Mensagem;
import javax.persistence.EntityManager;

/**
 *
 * @author Rafael
 */
public class MensagemDAO extends GenericDAO<Integer, Mensagem>{

    public MensagemDAO(EntityManager em) {
        super(em);
    }
    
    
}
