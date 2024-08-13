# Projeto de Cadastro de Pessoas

Este projeto é uma API REST desenvolvida com Spring Boot para o cadastro e gerenciamento de pessoas em uma organização. Ele utiliza o banco de dados H2 em memória para operações de CRUD (Criar, Ler, Atualizar, Deletar).

## Tecnologias Utilizadas

- **Spring Boot**: Facilita a criação de aplicações Spring stand-alone baseadas em microserviços.
- **Spring Data JPA**: Permite fácil integração entre a camada de acesso a dados e a JPA.
- **Spring Web**: Fornece funcionalidades para criação de aplicações web, incluindo RESTful applications usando o Spring MVC.
- **Banco de dados H2**: Banco de dados em memória ideal para desenvolvimento e testes devido à sua simplicidade e velocidade de configuração.
- **Maven**: Ferramenta de automação de compilação utilizada para gerenciar dependências e outras tarefas.

## Configuração e Instalação

Pré-requisitos:

- **Java JDK 11 ou superior**
- **Maven 3.6 ou superior**

## Clone o projeto

    git clone URL_DO_REPOSITORIO

## Navegue até o diretório do projeto e execute

    cd caminho_para_o_projeto
    mvn spring-boot:run

## Estrutura de Diretórios e Arquivos

    L:\VSCode\JAVA\DIO\Cadastro_Pessoas
    │
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── dio
    │   │   │           └── cadastro
    │   │   │               ├── CadastroPessoasApplication.java
    │   │   │               ├── controller
    │   │   │               │   └── PessoaController.java
    │   │   │               ├── model
    │   │   │               │   └── Pessoa.java
    │   │   │               ├── repository
    │   │   │               │   └── PessoaRepository.java
    │   │   │               ├── service
    │   │   │               │   └── PessoaService.java
    │   │   │               └── dto
    │   │   │                   └── PessoaDTO.java
    │   │   ├── resources
    │   │   │   ├── application.properties
    │   │   │   └── data.sql
    │   │   └── webapp
    │   └── test
    │       └── java
    │           └── com
    │               └── dio
    │                   └── cadastro
    │                       └── PessoaControllerTest.java
    └── pom.xml
    |__ README.md

Descrição dos Componentes

## Descrição dos Componentes

- **CadastroPessoasApplication.java**: Classe principal que inicia a aplicação Spring Boot.
- **PessoaController.java**: Controlador REST que gerencia as requisições HTTP para operações CRUD.
- **Pessoa.java**: Entidade que representa uma pessoa no banco de dados.
- **PessoaRepository.java**: Interface do Spring Data JPA para operações de banco de dados.
- **PessoaService.java**: Camada de serviço que contém a lógica de negócio.
- **PessoaDTO.java**: Objeto de Transferência de Dados (DTO) que abstrai a entidade Pessoa para a camada de rede.
- **application.properties**: Arquivo de configurações da aplicação, incluindo configurações do banco de dados.
- **data.sql**: Arquivo SQL para pré-popular o banco de dados com dados iniciais (opcional).
- **PessoaControllerTest.java**: Classe de teste para o controlador Pessoa.
- **pom.xml**: Arquivo de configuração Maven para gerenciamento de dependências e build do projeto.
- **README.md**: O arquivo de documentação

## Estrutura do Projeto

### Modelo de Dados

- **Pessoa**: Entidade que representa uma pessoa, contendo atributos como `id`, `nome` e `sobrenome`.

### Repositório

- **PessoaRepository**: Interface que estende `JpaRepository`, facilitando operações CRUD automatizadas.

### Serviço

- **PessoaService**: Serviço que encapsula a lógica de negócios, interagindo com `PessoaRepository` para manipular dados de pessoas.

### Controlador

- **PessoaController**: Controlador REST que expõe endpoints para interagir com o serviço e realizar operações CRUD.

## Endpoints da API

| Método  | Endpoint              | Descrição                          |
|---------|-----------------------|------------------------------------|
| POST    | `/api/pessoas`        | Cadastra uma nova pessoa.          |
| GET     | `/api/pessoas`        | Lista todas as pessoas cadastradas.|
| GET     | `/api/pessoas/{id}`   | Obtém detalhes de uma pessoa.      |
| PUT     | `/api/pessoas/{id}`   | Atualiza os dados de uma pessoa.   |
| DELETE  | `/api/pessoas/{id}`   | Remove uma pessoa do sistema.      |

## Banco de Dados

**Acesso ao console do H2:**

- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User Name**: `sa`
- **Password**: (deixe em branco)

## Explicações das Dependências para o arquivo POM.XML

- **spring-boot-starter-web**: Inclui dependências necessárias para o desenvolvimento de aplicações web, como o Tomcat como servidor embutido e o Spring MVC.
- **spring-boot-starter-data-jpa**: Facilita a implementação de repositórios JPA para acesso a dados.
- **spring-boot-starter-validation**: Fornece suporte à validação de beans, usando anotações comuns de validação.
- **mapstruct**: Usado para mapeamento entre diferentes modelos de objetos, útil para converter entidades de banco de dados em objetos de transferência de dados (DTOs).
- **spring-boot-starter-test**: Contém ferramentas para testar a aplicação, incluindo frameworks como JUnit e Mockito.
- **h2**: Banco de dados em memória, ideal para testes e desenvolvimento, não requer instalação e é facilmente configurável.

## Testes

Utilize ferramentas como Postman ou cURL para fazer requisições aos endpoints e verificar as respostas. Testes adicionais podem ser implementados utilizando JUnit e Spring Test.

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Clone o repositório.
2. Crie uma nova branch: `git checkout -b nome_da_nova_branch`.
3. Faça suas alterações.
4. Commit suas mudanças: `git commit -am 'Adiciona algumas mudanças'`.
5. Push para a branch: `git push origin nome_da_nova_branch`.
6. Submeta sua pull request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo `LICENSE` para mais detalhes.
