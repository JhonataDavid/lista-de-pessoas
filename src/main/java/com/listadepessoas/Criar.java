package com.listadepessoas;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia uma lista de pessoas.
 * Permite adicionar pessoas, mostrar a lista de pessoas,
 * exibir o tamanho da lista, e procurar pessoas pelo nome ou índice.
 */
public class Criar {
    // Atributo para armazenar a lista de pessoas
    private List<Pessoa> listaDePessoas = new ArrayList<>();

    /**
     * Construtor padrão da classe Criar.
     */
    public Criar() {
        // Construtor padrão, não faz nada específico neste caso
    }

    /**
     * Adiciona uma nova pessoa à lista.
     *
     * @param nome Nome da pessoa.
     * @param idade Idade da pessoa.
     * @param altura Altura da pessoa.
     */
    public void adicionarPessoa(String nome, int idade, double altura) {
        // Cria uma nova instância de Pessoa e adiciona à lista
        this.listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    /**
     * Exibe todas as pessoas na lista.
     * Caso a lista esteja vazia, uma mensagem é exibida informando isso.
     */
    public void mostrarListaDePessoas() {
        // Verifica se a lista está vazia
        if (listaDePessoas.isEmpty()) {
            System.out.println("Sua lista está vazia"); // Mensagem para lista vazia
        } else {
            System.out.println("--------------LISTA DE PESSOAS--------------");
            // Itera sobre cada pessoa na lista e imprime suas informações
            for (Pessoa pessoa : listaDePessoas) {
                System.out.println(pessoa);
            }
        }
    }

    /**
     * Exibe o número total de pessoas na lista.
     */
    public void mostrarTamanhoDaLista() {
        // Obtém o tamanho da lista
        int tamanhoDaLista = listaDePessoas.size();
        // Exibe o tamanho da lista
        System.out.println("Sua lista tem " + tamanhoDaLista + " pessoa(s)");
    }

    /**
     * Exibe a pessoa no índice especificado, se o índice for válido.
     * Caso contrário, exibe uma mensagem de erro.
     *
     * @param indiceQueDeseja Índice da pessoa desejada.
     */
    public void mostrarPessoaPeloIndice(int indiceQueDeseja) {
        // Verifica se o índice está dentro do intervalo da lista
        if (indiceQueDeseja >= 0 && indiceQueDeseja < this.listaDePessoas.size()) {
            // Imprime a pessoa no índice especificado
            System.out.println("A pessoa que deseja é a : " + listaDePessoas.get(indiceQueDeseja));
        } else {
            // Mensagem para índice fora do intervalo
            System.out.println("O índice que deseja está fora do intervalo da lista.");
            System.out.println("Esta lista possui apenas " + listaDePessoas.size() + " pessoa(s)");
        }
    }

    /**
     * Exibe todas as pessoas com o nome fornecido.
     * Se nenhuma pessoa for encontrada, uma mensagem é exibida.
     *
     * @param nome Nome da pessoa a ser procurada.
     */
    public void mostrarPessoasPeloNome(String nome) {
        boolean encontrou = false; // Flag para verificar se encontrou alguma pessoa
        // Itera sobre cada pessoa na lista
        for (Pessoa pessoa : listaDePessoas) {
            // Verifica se o nome da pessoa corresponde ao nome fornecido, ignorando maiúsculas e minúsculas
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa); // Imprime a pessoa encontrada
                encontrou = true; // Marca como encontrada
            }
        }
        // Verifica se nenhuma pessoa foi encontrada
        if (!encontrou) {
            // Mensagem caso nenhum nome corresponda
            System.out.println("Nenhuma pessoa com o nome " + nome + " foi encontrada.");
        }
    }
}
