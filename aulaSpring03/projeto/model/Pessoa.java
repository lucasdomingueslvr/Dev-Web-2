package com.example.projeto.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="pessoas")
public class Pessoa{

    @id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id;

    private String nome;
    private Ineer idade;


    public Pessoa(){}

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(Ineer idade) {
        this.idade = idade;
    }
    public  Ineer getIdade() {
        return idade;
    }
}