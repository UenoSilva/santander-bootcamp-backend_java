/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dio.ueno.main.Interfaces;

import com.dio.ueno.main.model.Foto;

/**
 *
 * @author Ueno
 */
public interface FotoInterface {
    
    void tirarFoto(Foto foto);
    
    void salvarFoto();
    
    void excluirFoto(String nome);
    
    void visualizarFoto(String nome);
    
}
