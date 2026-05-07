#  Loja Tech - Projeto Final Bloco 01

Sistema de gerenciamento de e-commerce desenvolvido em Java para o projeto final do Bloco 01 (Generation Brasil). O sistema utiliza conceitos de POO para gerenciar um inventário de produtos de forma dinâmica.

##  Funcionalidades (CRUD)
- **Cadastrar:** Adição de novos produtos.
- **Listar:** Exibição de todos os itens armazenados (via Collections).
- **Consultar por ID:** Busca específica de um item no estoque.
- **Atualizar:** Modificação de dados de produtos existentes.
- **Deletar:** Remoção de itens do sistema.

##  Conceitos de POO Aplicados
- **Abstração & Herança:** Classe mãe `Produto` e classe filha `Cosmetico`.
- **Encapsulamento:** Atributos privados protegidos por Getters e Setters.
- **Polimorfismo:** Sobrescrita do método `visualizar` e uso de interfaces.
- **Interface & Repository:** Padronização do CRUD através da `ProdutoRepository`.
- **Collections:** Armazenamento de dados em memória utilizando `ArrayList`.
- **Exceptions:** Tratamento de erros de digitação com `try-catch` (`InputMismatchException`).

##  Diferenciais (Features Extras)
- **Interface Colorida:** Utilização de códigos ANSI para melhor legibilidade no console.
- **Massa de Dados:** O sistema já inicia com produtos pré-cadastrados para testes imediatos da listagem.

##  Tecnologias
- **Java 17**
- **Spring Tool Suite (STS)**
- **Git & GitHub**

---
*Desenvolvido por Talita - 2026*
