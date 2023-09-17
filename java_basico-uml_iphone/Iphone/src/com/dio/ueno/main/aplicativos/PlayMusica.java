/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.model.Musica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ueno
 */
public class PlayMusica {

    private static List<Musica> musicas;
    private int numeroMusica;

    public PlayMusica() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusicar(String nome, String autor, double duracao, List<String> genero) {
        musicas.add(new Musica(nome, autor, duracao, genero));
    }

    public void reproduzir(String nome) {
        Musica musica = null;
        if (!musicas.isEmpty()) {
            List<Musica> mus = musicas.stream()
                    .filter((Musica m) -> m.getNome().equalsIgnoreCase(nome)).toList();
            numeroMusica = musicas.indexOf(mus.get(0));
            System.out.println("Reproduzindo:" + mus);
        } else {
            throw new RuntimeException("A lista de músicas está vazia.");
        }
    }

    public void parar() {
        System.out.println("Música parada!");
    }

    public void passarMusica() {
        Musica musica = null;
        if (numeroMusica < musicas.size()) {
            musica = musicas.get(numeroMusica + 1);
        } else {
            musica = musicas.get(0);
        }

        reproduzir(musica.getNome());
    }
}
