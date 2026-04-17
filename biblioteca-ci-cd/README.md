# Biblioteca CI/CD

Este projeto demonstra a implementação de um pipeline completo de CI/CD utilizando GitHub Actions e Docker.

## Tecnologias utilizadas

- Java 17
- Maven
- GitHub Actions
- Docker

## Como executar o projeto

### Compilar o projeto

mvn clean package

### Executar localmente

java -jar target/biblioteca-1.0-SNAPSHOT.jar

### Executar com Docker

docker build -t biblioteca-app .

docker run -d -p 8080:8080 biblioteca-app

## CI/CD

O projeto possui dois workflows:

### CI

Executa build e testes automaticamente em pushes e pull requests.

### CD

Simula um deploy automático ao fazer merge na branch main.

## Objetivo

Demonstrar na prática:

- Integração contínua (CI)
- Entrega contínua (CD)
- Containerização com Docker

## Autor

Lucas Bernardo Barrios

Projeto acadêmico para prática de DevOps.
