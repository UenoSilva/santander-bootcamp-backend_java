/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.ueno.main;

import com.dio.ueno.main.aplicativos.Mensageiro;
import com.dio.ueno.main.aplicativos.Telefone;
import java.util.ArrayList;
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
        
        
    }
    
}
