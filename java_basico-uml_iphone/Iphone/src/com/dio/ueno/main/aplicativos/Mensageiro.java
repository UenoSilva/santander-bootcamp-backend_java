package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.model.Contato;
import com.dio.ueno.main.Interfaces.ContatoInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ueno
 */
public class Mensageiro implements ContatoInterface {

    private Map<Contato, String> mensagem = new HashMap<>();
    private List<Contato> contatos;

    public Mensageiro(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void mensgens() {
        System.out.println(mensagem);
    }

    public void novaMensagem(int numero, String mensagem) {
        Contato contato = null;
        if(numero == selecionarContatoByNumero(numero).getNumero()){
            contato = selecionarContatoByNumero(numero);
        }else{
            contato = new Contato("", numero);
        }
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
        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatoSelecionado = c;
                }
            }
        } else {
            throw new RuntimeException("Lista Vazia");
        }
        return contatoSelecionado;
    }
    
    @Override
    public Contato selecionarContatoByNumero(int numero) {
        Contato contatoSelecionado = null;
        if (!contatos.isEmpty()) {
            List<Contato> con = contatos.stream()
                    .filter((Contato c)-> c.getNumero() == numero).toList();
            contatoSelecionado = con.get(0);
        } else {
            throw new RuntimeException("Lista Vazia");
        }
        return contatoSelecionado;
    }
}
