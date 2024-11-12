# SocialSpring - Backend de Rede Social com Spring Boot & MongoDB

Este projeto tem como objetivo desenvolver o backend de uma rede social simples, onde os usuários podem criar postagens, comentar em posts existentes e interagir com o conteúdo de outros usuários. A aplicação foi construída utilizando **Spring Boot** para o desenvolvimento da API RESTful e **MongoDB** como banco de dados NoSQL para o armazenamento dos dados.

## 📋 Funcionalidades

- **📢 Criação de Postagens**  
  Usuários podem criar posts contendo textos, que serão armazenados no banco de dados e visíveis para todos os usuários.

- **💬 Comentários em Postagens**  
  Cada post pode receber comentários de outros usuários, permitindo interação e engajamento.

- **🌐 API RESTful**  
  O backend é desenvolvido como uma API REST, facilitando a comunicação com o frontend e proporcionando flexibilidade para futuras integrações.

## 🛠 Tecnologias Utilizadas

- **Spring Boot**  
  Framework para desenvolvimento de aplicações Java de forma rápida e eficiente, com integração facilitada com o MongoDB.

- **MongoDB**  
  Banco de dados NoSQL para armazenamento de dados não estruturados e flexíveis. Ideal para a escalabilidade do projeto.

- **Spring Data MongoDB**  
  Integração entre o Spring Boot e o MongoDB, permitindo operações de leitura e escrita de dados de maneira eficiente.

## 🗂 Estrutura do Projeto

Este projeto está estruturado da seguinte forma:

Em desenvolvimento

## 🚀 Como Rodar o Projeto

1. Clone este repositório:
    ```bash
    git clone https://github.com/usuario/SocialSpring.git
    ```

2. Navegue até a pasta do projeto:
    ```bash
    cd SocialSpring
    ```

3. Crie e configure um banco de dados no **MongoDB** local ou remoto.

4. Configure as credenciais de banco de dados no arquivo `application.properties`:
    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/nome_do_banco
    ```

5. Compile e execute o projeto:
    ```bash
    ./mvnw spring-boot:run
    ```

6. A aplicação estará disponível na URL `http://localhost:8080`.

## 🤝 Contribuição

Se você deseja contribuir com o projeto, sinta-se à vontade para abrir *issues* ou enviar *pull requests*. Sua contribuição é bem-vinda!

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
# Social-Spring-MongoDB
