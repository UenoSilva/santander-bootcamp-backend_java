/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.ueno.main;

import com.dio.ueno.main.aplicativos.Camera;
import com.dio.ueno.main.model.Contato;
import com.dio.ueno.main.aplicativos.Mensageiro;
import com.dio.ueno.main.aplicativos.PlayMusica;
import com.dio.ueno.main.aplicativos.Telefone;
import com.dio.ueno.main.model.Foto;
import com.dio.ueno.main.model.Video;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ueno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Contato> contatos = new ArrayList<>();
        
        Telefone telefone = new Telefone(contatos);
        telefone.adicionarContato("Ueno", 87534223);
        telefone.adicionarContato("Jaime", 87554223);
        telefone.adicionarContato("Rodrigo", 87534223);
        telefone.adicionarContato("", 87534223);
        telefone.listaContatos();
        
        Mensageiro mensageiro = new Mensageiro(contatos);
        Contato c = mensageiro.selecionarContatoByNome("Ueno");
        mensageiro.novaMensagem(c, "Oi");
        mensageiro.mensgens();
        
        PlayMusica playMusica = new PlayMusica();
        playMusica.adicionarMusicar("Papercut", "Linkim Park", 3.42, new ArrayList<>(Arrays.asList("Rock","Alternative")));
        playMusica.adicionarMusicar("in the end", "Linkim Park", 4.00, new ArrayList<>(Arrays.asList("Rock","Alternative")));
        playMusica.adicionarMusicar("Crawling", "Linkim Park", 4.22, new ArrayList<>(Arrays.asList("Rock","Alternative")));
        playMusica.adicionarMusicar("Chairman", "Linkim Park", 3.30, new ArrayList<>(Arrays.asList("Rock","Alternative")));
        playMusica.reproduzir("Papercut");
        playMusica.passarMusica();
        playMusica.parar();
        playMusica.passarMusica();
        
        Camera camera = new Camera();
        camera.tirarFoto(new Foto("Selfie", "Uma foto de si mesmo", 3.0));
        camera.salvarFoto();
        camera.tirarFoto(new Foto("Ipê", "Uma arvore de ipê amarelo", 4.0));
        camera.salvarFoto();
        camera.tirarFoto(new Foto("Carro", "Uma foto de um carro", 1.5));
        camera.tirarFoto(new Foto("Moto", "Uma foto de uma moto", 3.0));
        camera.salvarFoto();
        camera.visualizarFoto("Ipê");
        camera.excluirFoto("Selfie");
        
        camera.gravar(new Video("", "", 0));
        camera.salvarVideo();
        camera.visualizarVideo("");
        camera.excluirVideo("");
    }
    
}
