---

# 🚗 API de Carros

Este projeto é uma API REST para gerenciar carros. Permite a criação, listagem, atualização e remoção de registros de veículos.

## 🛠 Tecnologias Utilizadas

- ☕ Java
- 🖥 Spring Boot
- 📦 Spring Data JPA
- 🗄 Banco de Dados: PostgreSQL
- ⚙ Hibernate

## 🗃 Configuração do Banco de Dados

No arquivo `application.properties`, configure a conexão com o PostgreSQL da seguinte maneira:

```
spring.application.name=ApiCadastroDeCarros

spring.datasource.url=jdbc:postgresql://localhost:5432/cadastro_de_carros
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

## 🔗 Endpoints da API

### 🌍 Rota Base

```
/api/carros
```

### ➕ Criar um novo carro

**Endpoint:**

```
POST /api/carros/add
```

**Exemplo de JSON para requisição:**

```json
{
    "marca": "BMW",
    "modelo": "M3",
    "ano": "2023",
    "cor": "Azul",
    "imgUrl": "https://exemplo.com/bmw-m3.jpg"
}
```

### 📜 Listar todos os carros

**Endpoint:**

```
GET /api/carros/all
```

### 🔍 Buscar um carro pelo ID

**Endpoint:**

```
GET /api/carros/find/{id}
```

**Exemplo:**

```
GET /api/carros/find/1
```

### 🔄 Atualizar um carro pelo ID

**Endpoint:**

```
PUT /api/carros/update/{id}
```

**Exemplo de JSON para atualização:**

```json
{
    "marca": "BMW",
    "modelo": "M4",
    "ano": "2024",
    "cor": "Preto",
    "imgUrl": "https://exemplo.com/bmw-m4.jpg"
}
```

### ❌ Deletar um carro pelo ID

**Endpoint:**

```
DELETE /api/carros/delete/{id}
```

**Exemplo:**

```
DELETE /api/carros/delete/1
```

## 🚀 Como Executar o Projeto

1. Clone este repositório:
   ```
   git clone https://github.com/Morettys2/ApiCadastroDeCarros.git
   ```
2. Acesse o diretório do projeto:
   ```
   cd ApiCadastroDeCarros
   ```
3. Configure o banco de dados PostgreSQL no `application.properties`
4. Execute o projeto com:
   ```
   mvn spring-boot:run
   ```

Agora sua API estará rodando e pronta para uso! 🎉

## 📦 Dependências Utilizadas

As dependências utilizadas neste projeto são as seguintes:

- **Spring Web**: Para construir APIs RESTful.
- **Spring Boot DevTools**: Para facilitar o desenvolvimento com recarregamento automático da aplicação.
- **Lombok**: Para reduzir o código boilerplate, como getters, setters e construtores.
- **PostgreSQL Driver**: Para conectar a aplicação ao banco de dados PostgreSQL.

Estas dependências estão descritas no arquivo `pom.xml` do projeto.

---
