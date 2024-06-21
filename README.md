# Estrutura de Dados em Java

- [Introdução](#introdução)
- [Estruturas de Dados Implementadas](#estruturas-de-dados-implementadas)
  - [Lista Ligada](#lista-ligada)
  - [Pilha](#pilha)
  - [Fila](#fila)
  - [Árvore](#árvore)
  - [Árvore Binária](#árvore-binária)
  - [Árvore Binária de Busca](#árvore-binária-de-busca)
- [Tabela de Comparação](#tabela-de-comparação)
- [Ferramentas](#ferramentas)
- [Contribuição](#contribuição)

## Introdução

Este projeto é uma coleção de implementações de estruturas de dados em Java, desenvolvidas para fins educacionais. Ele cobre desde estruturas de dados básicas como listas e pilhas até árvores binárias de busca. Abaixo está uma explicação detalhada sobre cada uma das classes implementadas e os conceitos fundamentais de cada estrutura de dados.

## Estruturas de Dados Implementadas

### Lista Ligada (`LinkedList`)
Uma lista ligada é uma coleção de nós onde cada nó contém um valor e uma referência ao próximo nó da sequência. É útil para inserções e exclusões rápidas, pois não exige o deslocamento dos elementos subsequentes como em um array.

**Características:**
- Cada nó aponta para o próximo nó na lista.
- O tempo de acesso para elementos é linear (O(n)).
- Pode crescer dinamicamente conforme necessário.

### Pilha (`Stack`)
Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser removido.

**Características:**
- Operações principais: `push` (adiciona um elemento ao topo) e `pop` (remove o elemento do topo).
- Útil para problemas de recursão e algoritmos de backtracking.
- Implementação simples com arrays ou listas ligadas.

### Fila (`Queue`)
Uma fila é uma estrutura de dados que segue o princípio FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.

**Características:**
- Operações principais: `enqueue` (adiciona um elemento ao final) e `dequeue` (remove o elemento do início).
- Usada em sistemas de processamento de tarefas e gerenciamento de recursos.
- Pode ser implementada com arrays circulares ou listas ligadas.

### Árvore (`Tree`)
Uma árvore é uma estrutura de dados hierárquica composta por nós, onde cada nó tem um valor e referências para seus filhos. É usada para representar dados com uma estrutura hierárquica.

**Características:**
- Um nó raiz no topo, com nós filhos abaixo.
- Subárvores que são elas mesmas árvores.
- Tipos específicos incluem árvores binárias, AVL, e B-trees.

### Árvore Binária (`Binary Tree`)
Uma árvore binária é uma árvore em que cada nó tem no máximo dois filhos, chamados de filho esquerdo e filho direito.

**Características:**
- Facilita operações de inserção, busca e exclusão.
- Pode ser completa, cheia ou degenerada.
- Usada em várias aplicações como expressões aritméticas e estruturas de dados.

### Árvore Binária de Busca (`Binary Search Tree`)
Uma árvore binária de busca é uma árvore binária onde cada nó segue a propriedade de ordenação: o valor do filho esquerdo é menor que o valor do nó e o valor do filho direito é maior que o valor do nó.

**Características:**
- Permite buscas rápidas (O(log n)) quando balanceada.
- Suporta operações dinâmicas de inserção e exclusão.
- Utilizada em implementações de dicionários e conjuntos.

## Tabela de Comparação

| Estrutura                | Acesso   | Inserção | Remoção  | Uso Típico                        |
|--------------------------|----------|----------|----------|-----------------------------------|
| Lista Ligada             | O(n)     | O(1)     | O(1)     | Implementação de listas dinâmicas |
| Pilha                    | O(n)     | O(1)     | O(1)     | Algoritmos de backtracking        |
| Fila                     | O(n)     | O(1)     | O(1)     | Sistemas de filas de espera       |
| Árvore                   | O(n)     | O(n)     | O(n)     | Representação hierárquica         |
| Árvore Binária           | O(log n) | O(log n) | O(log n) | Estruturas de dados diversas      |
| Árvore Binária de Busca  | O(log n) | O(log n) | O(log n) | Busca eficiente e ordenação       |

## Ferramentas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.
