/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.valida;

import br.edu.utfpr.model.Usuario;

/**
 *
 * @author Rafael
 */
public interface Strategy {
    public Boolean autentica(Usuario u);
}
