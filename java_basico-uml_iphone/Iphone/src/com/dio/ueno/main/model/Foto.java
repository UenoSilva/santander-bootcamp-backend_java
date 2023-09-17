/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.model;

/**
 *
 * @author Ueno
 */
public class Foto {

    private String nome;
    private String descricao;
    private double tamanho;

    public Foto(String nome, String descricao, double tamanho) {
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Foto{" + "nome=" + nome + ", descricao=" + descricao + ", tamanho=" + tamanho + '}';
    }

}
