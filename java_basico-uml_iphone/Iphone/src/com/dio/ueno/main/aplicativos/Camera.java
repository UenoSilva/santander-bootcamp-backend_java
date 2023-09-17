/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.Interfaces.FotoInterface;
import com.dio.ueno.main.Interfaces.VideoInterface;
import com.dio.ueno.main.model.Foto;
import com.dio.ueno.main.model.Video;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ueno
 */
public class Camera implements FotoInterface, VideoInterface {

    private List<Foto> fotos;
    private List<Video> videos;
    private Foto foto;
    private Video video;

    public Camera() {
        this.fotos = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    @Override
    public void tirarFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public void salvarFoto() {
        fotos.add(foto);
        System.out.println("Foto salvar");
    }

    @Override
    public void excluirFoto(String nome) {
        if (!fotos.isEmpty()) {
            List<Foto> f = fotos.stream()
                    .filter((Foto foto) -> foto.getNome().equalsIgnoreCase(nome)).toList();
            System.out.println("Foto removida: " + f);
            fotos.remove(f);
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    @Override
    public void visualizarFoto(String nome) {
        if (!fotos.isEmpty()) {
            List<Foto> f = fotos.stream()
                    .filter((Foto foto) -> foto.getNome().equalsIgnoreCase(nome)).toList();
            System.out.println("Foto " + f);
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    @Override
    public void gravar(Video video) {
        this.video = video;
    }

    @Override
    public void salvarVideo() {
        videos.add(video);
        System.out.println("Video salvo");
    }

    @Override
    public void excluirVideo(String nome) {
        if (!videos.isEmpty()) {
            List<Video> v = videos.stream()
                    .filter((Video video) -> video.getNome().equalsIgnoreCase(nome)).toList();
            System.out.println("Video excluido: " + v);
            videos.remove(v);
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    @Override
    public void visualizarVideo(String nome) {
        if (!videos.isEmpty()) {
            List<Video> v = videos.stream()
                    .filter((Video video) -> video.getNome().equalsIgnoreCase(nome)).toList();
            System.out.println("Video " + v);
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

}
