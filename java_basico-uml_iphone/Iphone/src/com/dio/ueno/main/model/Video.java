/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.model;

/**
 *
 * @author Ueno
 */
public class Video {

    private String nome;
    private String descricao;
    private double duracao;

    public Video(String nome, String descricao, double duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
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

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Video{" + "nome=" + nome + ", descricao=" + descricao + ", duracao=" + duracao + '}';
    }

}
