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
public class Desconectado implements State{

    private final String msg = "Desconectado";
    
    @Override
    public String enviaMensagem() {
        return this.msg;
    }

    @Override
    public Boolean conectado() {
        return false;
    }

    @Override
    public String toString() {
        return "Desconectado{" + "msg=" + msg + '}';
    }
}
