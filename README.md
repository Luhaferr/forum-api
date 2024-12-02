# Forum Hub API

A **Forum Hub API** é uma **API REST** desenvolvida o para gerenciamento de tópicos de fórum. Permite aos usuários cadastrar novos tópicos, detalhar, listar, atualizar e excluir tópicos. Além disso, oferece um sistema de autenticação utilizando JWT e Spring Security para proteger as rotas.

## Funcionalidades

- **Cadastro de Tópicos:** Permite a criação de novos tópicos no fórum.
- **Detalhamento de Tópicos:** Exibe as informações detalhadas de um tópico específico.
- **Listagem de Tópicos:** Exibe todos os tópicos cadastrados no sistema.
- **Atualização de Tópicos:** Permite a atualização de dados de um tópico existente.
- **Exclusão de Tópicos:** Exclui um tópico do fórum.
- **Autenticação com JWT:** Protege as rotas da API utilizando token JWT.
- **Autenticação de Usuário com Spring Security:** Sistema de autenticação e autorização para garantir que apenas usuários autenticados possam acessar as rotas protegidas.

## Tecnologias

- **Java 17** (ou superior)
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **Flyway Migration**
- **Lombok**
- **MySQL** (Banco de dados)
- **Maven** para gerenciamento de dependências

## Configuração do Projeto

1. **Criação do Projeto com Spring Initializr**:
    
    - Java: 17 ou superior
    - Maven: versão 4
    - Spring Boot: versão mais recente
    - Projeto em formato JAR

## Configuração do Banco de Dados

- **Banco de Dados**: MySQL
- **Conexão**: Configuração do banco no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forum_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.flyway.enabled=true
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

server.error.include-stacktrace=never

api.security.token.secret=${JWT_SECRET:123456789}
```

## Como Rodar o Projeto

1. **Clone o repositório**:
    
    ```bash
    git clone https://github.com/Luhaferr/forum-api.git
    ```
    
2. **Instale as dependências** com Maven:

    ```bash
    mvn clean install
    ```
    
3. **Configure o banco de dados**: Certifique-se de ter o MySQL rodando e crie o banco `forum_db`.
    
4. **Execute a aplicação**: Você pode rodar a aplicação com o seguinte comando:

    ```bash
    mvn spring-boot:run    
    ```
    
5. **Insira um login e uma senha na tabela `usuarios`.

6. **Endpoints de Autenticação**:
    
    - **Login**: Realize o login para obter o token JWT.
    - **Exemplo de requisição**:

        ```bash
        POST /login 
        Content-Type: application/json 
        {     
	        "username": "usuario",    
	        "password": "senha" 
        }
        ```
        
        Retorno:

        ```json
        {     
	        "token": "jwt_token_aqui" 
        }
        ```
        
7. **Proteção das rotas**: Usando Postman ou Insomnia, adicione o token JWT obtido no cabeçalho da requisição para acessar as rotas protegidas, incluindo a criação, atualização, listagem e exclusão de tópicos.

## Observações
Esse projeto faz parte de um desafio de conclusão proposto pela ONE (Oracle + Alura) e foi desenvolvido com a finalidade de estudar e aprender, por isso, podem ocorrer bugs ou comportamentos inexperados.

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Contato
Luiz Ferreira - luhaferr@gmail.com

Link do Projeto: https://github.com/luhaferr/forum-api
