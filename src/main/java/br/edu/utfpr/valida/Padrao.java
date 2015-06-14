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
public class Padrao implements Strategy{
    
    private Usuario u;
    
    public Padrao(Usuario u){
        this.u = u;
    }
    
    public void setU(Usuario u){
        this.u = u;
    }
        
    @Override
    public Boolean autentica(Usuario u) {
        System.out.println("Efetuando autenticação");
        return u.getUsuario().equalsIgnoreCase("root") && u.getSenha().equalsIgnoreCase("root");
    }
}
