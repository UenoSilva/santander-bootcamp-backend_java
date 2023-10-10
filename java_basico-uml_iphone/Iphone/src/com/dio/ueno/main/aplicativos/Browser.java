/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.aplicativos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ueno
 */
public class Browser {
    
    private String url;
    private Map<Integer, String> abas;
    int abaAtual = 1;
    
    public Browser(){
        this.abas = new HashMap<>();
        abas.put(abaAtual, "");
    }
    
    public void acessarSite(String site){
        url = site;
        abas.put(abaAtual, url);
        System.out.println("Site: " + site);
    }
    
    public void atualizarPagina(){
        System.out.println("Atualizando página " + abas.get(abaAtual));
    }
    
    public void novoAba(){
        int numeroAbas = abas.size();
        abaAtual = numeroAbas+1;
        abas.put(numeroAbas+1, null);
        System.out.println("Nova aba aberta!");
    }
    
    public void selecionarAba(int aba){
        if(aba > abas.size()){
            novoAba();
            System.out.println("Aba: " + abas.get(abaAtual));
        }else{
            abaAtual = aba;
            System.out.println("Aba: " + abas.get(abaAtual));
        }
    }
}
