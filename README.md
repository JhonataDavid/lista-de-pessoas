# Projeto Lista de Pessoas

## Descrição

O projeto "Lista de Pessoas" é um sistema simples em Java para gerenciar uma lista de pessoas. Através desse sistema, você pode adicionar pessoas, visualizar a lista de pessoas, verificar o tamanho da lista, e procurar pessoas por nome ou índice.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **`Criar`**: Gerencia a lista de pessoas e fornece métodos para adicionar, exibir e procurar pessoas.
2. **`Pessoa`**: Representa uma pessoa com atributos básicos como nome, idade e altura.

### Classe `Criar`

A classe `Criar` é responsável por gerenciar uma lista de objetos `Pessoa`. Aqui estão os métodos e suas funcionalidades:

#### Atributos

- `private List<Pessoa> listaDePessoas`: Armazena a lista de pessoas.

#### Construtor

- `public Criar()`: Construtor padrão que inicializa a lista de pessoas.

#### Métodos

- **`public void adicionarPessoa(String nome, int idade, double altura)`**
  - Adiciona uma nova pessoa à lista.
  - **Parâmetros:**
    - `nome`: Nome da pessoa.
    - `idade`: Idade da pessoa.
    - `altura`: Altura da pessoa.

- **`public void mostrarListaDePessoas()`**
  - Exibe todas as pessoas na lista. Se a lista estiver vazia, exibe uma mensagem informando isso.

- **`public void mostrarTamanhoDaLista()`**
  - Exibe o número total de pessoas na lista.

- **`public void mostrarPessoaPeloIndice(int indiceQueDeseja)`**
  - Exibe a pessoa no índice especificado.
  - **Parâmetro:**
    - `indiceQueDeseja`: Índice da pessoa desejada.
  - Se o índice estiver fora do intervalo da lista, exibe uma mensagem de erro.

- **`public void mostrarPessoasPeloNome(String nome)`**
  - Exibe todas as pessoas com o nome fornecido.
  - **Parâmetro:**
    - `nome`: Nome da pessoa a ser procurada.
  - Se nenhuma pessoa for encontrada, exibe uma mensagem informando isso.

- **`public void removerPessoa(String nome)`**
  - Remove todas as pessoas da lista que possuem o nome fornecido.
  - **Parâmetro:**
    - `nome`: Nome da pessoa a ser removida. A busca é feita de forma insensível a maiúsculas e minúsculas.
  - **Descrição:**
    - Cria uma lista auxiliar para armazenar as pessoas a serem removidas.
    - Itera sobre a lista de pessoas para identificar aquelas cujo nome corresponde ao nome fornecido.
    - Remove todas as pessoas encontradas da lista principal.
    - Se o nome fornecido for nulo ou vazio, o método não realiza nenhuma remoção.
    - Se nenhuma pessoa com o nome especificado for encontrada, não há mensagem adicional além da remoção.

### Classe `Pessoa`

A classe `Pessoa` representa uma pessoa com os seguintes atributos e métodos:

#### Atributos

- `private String nome`: Nome da pessoa.
- `private int idade`: Idade da pessoa.
- `private double altura`: Altura da pessoa.

#### Construtor

- `public Pessoa(String nome, int idade, double altura)`
  - Inicializa uma nova instância da classe `Pessoa` com os valores fornecidos.

#### Métodos

- **`public String getNome()`**
  - Retorna o nome da pessoa.

- **`public int getIdade()`**
  - Retorna a idade da pessoa.

- **`public double getAltura()`**
  - Retorna a altura da pessoa.

- **`public void setNome(String nome)`**
  - Define o nome da pessoa.

- **`public void setIdade(int idade)`**
  - Define a idade da pessoa.

- **`public void setAltura(double altura)`**
  - Define a altura da pessoa.

- **`@Override public String toString()`**
  - Retorna uma representação em string da pessoa, incluindo nome, idade e altura.

- **`@Override public boolean equals(Object o)`**
  - Compara a pessoa atual com outro objeto para verificar se são iguais.

- **`@Override public int hashCode()`**
  - Retorna o código hash da pessoa, baseado nos atributos nome, idade e altura.

## Exemplos de Uso

Aqui está um exemplo de como você pode usar as classes `Criar` e `Pessoa`:

```java
public class Main {
    public static void main(String[] args) {
        // Criação do gerenciador de pessoas
        Criar gerenciador = new Criar();

        // Adicionando pessoas
        gerenciador.adicionarPessoa("David", 21, 1.70);
        gerenciador.adicionarPessoa("Marilia", 20, 1.60);

        // Exibindo a lista de pessoas
        gerenciador.mostrarListaDePessoas();

        // Exibindo o tamanho da lista
        gerenciador.mostrarTamanhoDaLista();

        // Exibindo pessoa pelo índice
        gerenciador.mostrarPessoaPeloIndice(1);

        // Exibindo pessoas pelo nome
        gerenciador.mostrarPessoasPeloNome("David");

        // Removendo pessoas pelo nome
        gerenciador.removerPessoa("David");

        // Exibindo a lista de pessoas após remoção
        gerenciador.mostrarListaDePessoas();
    }
}
