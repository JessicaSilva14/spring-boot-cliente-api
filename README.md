# 👥 Microserviço de Clientes (Cliente Service)

Este é um microserviço simples e independente desenvolvido em **Java** com **Spring Boot** para o gerenciamento de clientes. O projeto simula uma arquitetura de microserviços isolada, expondo uma API RESTful para realizar operações essenciais de cadastro, alteração e pesquisa de clientes, utilizando persistência de dados em memória.

## 🚀 Tecnologias Utilizadas

*   **Java 17** (ou superior)
*   **Spring Boot 3** (Framework core)
*   **Spring Data JPA** (Camada de persistência de dados)
*   **H2 Database** (Banco de dados em memória para testes rápidos)
*   **Lombok** (Automatização de códigos boilerplate como getters e setters)
*   **Maven** (Gerenciador de dependências e build)

## 📁 Estrutura do Projeto

O código foi organizado seguindo o padrão de arquitetura em camadas para garantir a separação de responsabilidades:

```text
com.exemplo.clienteservice
├── controller     # Endpoints HTTP (Porta de entrada da API)
├── model          # Entidade mapeada para o banco de dados (Cliente)
├── repository     # Interface de comunicação com o banco de dados (JPA)
└── service        # Camada de lógica e regras de negócio

Endpoints da API (Rotas REST)A API roda por padrão na porta 8081. O caminho base para as requisições é /api/clientes.MétodoEndpointDescriçãoStatus de SucessoPOST/api/clientesCadastra um novo cliente201 CreatedGET/api/clientesPesquisa/Lista todos os clientes200 OKGET/api/clientes/{id}Pesquisa um cliente específico por ID200 OKPUT/api/clientes/{id}Altera os dados de um cliente existente200 OK

📝 Exemplos de Payload (JSON)
Criar / Alterar Cliente (POST ou PUT)

{
  "nome": "Jessica Silva",
  "email": "jessica@email.com",
  "cpf": "123.456.789-00"
}

Retorno de Sucesso (200 OK / 201 Created)

{
  "id": 1,
  "nome": "Jessica Silva",
  "email": "jessica@email.com",
  "cpf": "123.456.789-00"
}

🛠️ Como Executar o Projeto Localmente
Pré-requisitos
Ter o Java 17 ou 21 instalado na máquina.

🛢️ Console do Banco de Dados H2
Para visualizar o banco de dados em tempo real e consultar a tabela CLIENTE, você pode acessar a interface web do H2 no navegador enquanto a aplicação estiver rodando:

URL: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:clientedb

User Name: sa

Password: (deixe em branco)

---
