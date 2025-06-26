# 📝 Projeto Frases Cinematográficas - Spring Boot

Este projeto é um sistema completo de exibição de frases do mundo pop de filmes e séries, com um backend em Java (Spring Boot) e um frontend simples com HTML, CSS e JavaScript. Foi desenvolvido como projeto final de um curso de Spring Boot, como foco em criação de API REST, arquitetura MVC, mapeamento de rotas com anotações Spring, boas práticas com DTOs e camadas de serviço, integração com o Front-End e tratamento de CORS.

## 📁 Estrutura do Projeto

- `backFrases/`: Backend desenvolvido com Spring Boot
- `frontFrases/3356-java-desafio-front/`: Frontend estático com HTML, CSS e JS

## 🚀 Funcionalidades

- Exibe frases motivacionais aleatórias
- Backend com suporte a CORS
- API RESTful com endpoint para obter frases
- Banco de dados populado automaticamente com frases

## 🔧 Tecnologias Utilizadas

### Backend
- Java 17+
- Spring Boot
- Maven

### Frontend
- HTML5
- CSS3
- JavaScript

## ▶️ Como Rodar o Projeto

```git
git clone https://github.com/GMiranda21ML/Frases-SpringBoot.git
```

### 1. Backend

```bash
cd backFrases
./mvnw spring-boot:run
```

A API estará disponível em http://localhost:8080.

### 2. Frontend
Abra o arquivo index.html dentro da pasta frontFrases/3356-java-desafio-front/ em um navegador.

📌 Endpoints da API
- GET /frases: retorna uma frase de um filme

## 🗃️ Dados Iniciais
O sistema carrega automaticamente um conjunto de frases no início, via a classe CarregarDados.java.