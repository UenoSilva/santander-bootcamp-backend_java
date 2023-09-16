/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.Contato;
import com.dio.ueno.main.Interfaces.ContatoInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ueno
 */
public class Mensageiro implements ContatoInterface{
    
    private Map<Contato,String> mensagem = new HashMap<>();
    private List<Contato> contatos;
    
    public Mensageiro(List<Contato> contatos){
        this.contatos = contatos;
    }
    
    public void mensgens(){
        System.out.println(mensagem);
    }
    
    public void novaMensagem(Contato contato, String mensagem){
        this.mensagem.put(contato, mensagem);
        System.out.println("Mensagem enviada para " + contato.getNome());
    }

    @Override
    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    @Override
    public void listaContatos() {
        System.out.println(contatos);
    }

    @Override
    public Contato selecionarContatoByNome(String nome) {
        Contato contatoSelecionado = null;
        if(!contatos.isEmpty()){
            for(Contato c : contatos){
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatoSelecionado = c;
                }
            }
        }else{
            throw new RuntimeException("Lista Vazia");
        }
        return contatoSelecionado;
    }
}
