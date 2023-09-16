package com.dio.ueno.main.Interfaces;

import com.dio.ueno.main.Contato;

/**
 *
 * @author Ueno
 */
public interface ContatoInterface {

    void adicionarContato(String nome, int numero);

    void listaContatos();

    Contato selecionarContatoByNome(String nome);
}
