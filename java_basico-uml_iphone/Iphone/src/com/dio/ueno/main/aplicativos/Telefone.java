package com.dio.ueno.main.aplicativos;

import com.dio.ueno.main.model.Contato;
import com.dio.ueno.main.Interfaces.ContatoInterface;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Ueno
 */
public class Telefone implements ContatoInterface {

    private Contato contato;

    private List<Contato> contatos;

    public Telefone(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void contato() {
        contato.toString();
    }

    public void ligar(String nome) {
        Contato c = selecionarContatoByNome(nome);
        System.out.println("Ligando para o numero: " + c.getNumero());
    }

    public void atender(Contato contato, boolean atende) {
        System.out.println("Ligação de " + contato.getNumero());

        if (atende) {
            System.out.println("Ligação atentida");
        } else {
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
        if (!contatos.isEmpty()) {
            contatoSelecionado = (Contato) contatos.stream()
                    .filter((Contato c) -> c.getNome().equalsIgnoreCase(nome)).toList();
        } else {
            throw new RuntimeException("Lista Vazia");
        }
        return contatoSelecionado;
    }

}
