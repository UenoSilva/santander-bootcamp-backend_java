/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.model;

import java.util.List;

/**
 *
 * @author Ueno
 */
public class Musica {

    private String nome;
    private String autor;
    private double duracao;
    private List<String> genero;

    public Musica(String nome, String autor, double duracao, List<String> genero) {
        this.nome = nome;
        this.autor = autor;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" + "nome=" + nome + ", autor=" + autor + ", duracao=" + duracao + ", genero=" + genero + '}';
    }

}
