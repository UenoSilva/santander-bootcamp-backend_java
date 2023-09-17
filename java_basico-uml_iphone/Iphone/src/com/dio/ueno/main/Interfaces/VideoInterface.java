/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dio.ueno.main.Interfaces;

import com.dio.ueno.main.model.Video;

/**
 *
 * @author Ueno
 */
public interface VideoInterface {

    void gravar(Video video);

    void salvarVideo();

    void excluirVideo(String nome);

    void visualizarVideo(String nome);

}
