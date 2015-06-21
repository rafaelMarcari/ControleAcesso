/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.proxy;

import br.edu.utfpr.model.Pasta;
import br.edu.utfpr.model.Usuario;
import br.edu.utfpr.state.Conectado;
import br.edu.utfpr.state.State;
import br.edu.utfpr.valida.Strategy;

/**
 *
 * @author Rafael
 */
public class Proxy implements IPasta{

    private Pasta diretorio;
    private final Usuario u;
    private final Strategy valida;
    private String msg;

    public Proxy(Usuario u, Strategy valida) {
        this.u = u;
        this.valida = valida;
    }
    
    private String real(){
        State es = new Conectado();
        u.setState(es);
        System.out.println(u.getState());
        diretorio = new Pasta();
        msg = diretorio.doSomething();
        System.out.println(msg);
        return msg;
    }
    
    @Override
    public String doSomething() {
        if (valida.autentica(u)) {
            return real();            
        } else {
            System.out.println(u.getState());
            System.out.println("Você não possui permissão para acessar este diretório");
            return msg;
        }
    }   
}
