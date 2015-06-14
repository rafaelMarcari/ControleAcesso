/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.state;

/**
 *
 * @author Rafael
 */
public class Conectado implements State{
    private final String msg = "Conectado";

    @Override
    public String enviaMensagem() {
        return this.msg;
    }

    @Override
    public Boolean conectado() {
        return true;
    }

    @Override
    public String toString() {
        return "Conectado{" + "msg=" + msg + '}';
    }
    
}
