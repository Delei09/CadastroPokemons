/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

import java.io.Serializable;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@Table (name = "dados")
public class dados implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "forca", nullable = false)
    private double forca;
  
    @Column (name = "nome", nullable = false, length = 60)
    private String nome;
    
    @Column (name = "datacaptura", nullable = false, length = 15)
    private String data;
    
    @Column (name = "tipoPokemon", nullable = false, length = 15)
    private String tipo;

    public dados() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
    
    
}
