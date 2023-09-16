/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.Contato;
import com.dio.ueno.main.Interfaces.ContatoInterface;
import java.util.List;

/**
 *
 * @author Ueno
 */
public class Telefone implements ContatoInterface{
    
    private Contato contato;
    
    private List<Contato> contatos;
    
    public Telefone(List<Contato> contatos){
        this.contatos = contatos;
    }
    
    public void contato(){
        contato.toString();
    }
    
    public void ligar(String nome){
        Contato c = selecionarContatoByNome(nome);
        System.out.println("Ligando para o numero: " + c.getNumero());
    }
    
    public void atender(Contato contato, boolean atende){
        System.out.println("Ligação de " + contato.getNumero());
        
        if(atende){
            System.out.println("Ligação atentida");
        }else{
            System.out.println("Ligação recursada");
        }
    }

    @Override
    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    @Override
    public void listaContatos() {
        System.out.println(this.contatos);
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
