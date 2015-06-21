/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model;

import br.edu.utfpr.proxy.IPasta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "tb_pasta")
public class Pasta implements IPasta, Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String path;
    
    @OneToMany(mappedBy = "pasta", targetEntity = Arquivo.class, cascade = CascadeType.ALL)
    private List<Arquivo> arquivos;

    public Pasta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
    
    public void valida() {
        if(nome == null || path == null){
            throw new IllegalArgumentException("Nome ou caminho da pasta não podem ser nulo");
        }
    }

    @Override
    public String toString() {
        return "Pasta{" + "nome=" + nome + ", path=" + path + '}';
    }

    @Override
    public String doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
