# 🏠 Corretora de Imóveis - Back-End

Sistema completo de gerenciamento para uma corretora de imóveis, desenvolvido com **Spring Boot 4 + Java 21 + H2**.

Projeto BackEnd contendo API REST e interface web moderna.

---

## 🚀 Tecnologias Utilizadas

### 🔹 Backend
![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-green?style=for-the-badge&logo=springboot)
![Spring Web](https://img.shields.io/badge/Spring_Web-MVC-brightgreen?style=for-the-badge)
![Spring Data JPA](https://img.shields.io/badge/JPA-Hibernate-orange?style=for-the-badge)
![H2](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge)
![Lombok](https://img.shields.io/badge/Lombok-Enabled-pink?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

---

## 📌 Funcionalidades

### 🏘 Imóveis
- Cadastro de imóveis
- Filtro por tipo
- Filtro por faixa de preço
- Busca por endereço
- Atualização de status

### 👤 Clientes
- Cadastro de clientes
- Listagem de clientes

### 📅 Visitas
- Agendamento de visitas
- Controle de status da visita
- Relacionamento Cliente x Imóvel

---

## 🏗 Arquitetura Backend

Estrutura organizada por camadas:

Padrão:
- Controller → Camada HTTP
- Service → Regra de negócio
- Repository → Acesso a dados
- DTO → Entrada/Saída
- Exception Handler → Tratamento global

---

## 🗄 Banco de Dados

Banco utilizado: **H2 (em memória)**


---

## 🖥 Interface

### 📊 Dashboard
- Total de imóveis
- Total de clientes
- Total de visitas

### 🏘 Gestão de Imóveis
- Cadastro
- Filtros
- Listagem

### 👤 Gestão de Clientes
- Cadastro
- Listagem

### 📅 Gestão de Visitas
- Agendamento
- Visualização

---

## 📈 Diferenciais Técnicos

- Arquitetura em camadas
- Uso de Specification para filtros dinâmicos
- Paginação com Pageable
- DTOs para segurança de dados
- Tratamento global de exceções
- Integração Frontend + Backend
- Código limpo e organizado

---

## 👨‍💻 Autor

**Guilherme Melo**

Desenvolvedor Java | Spring Boot | Backend & Fullstack

---

## ⭐ Próximas Melhorias

- Autenticação JWT
- Deploy em nuvem
- Docker
- Testes automatizados
- PostgreSQL

---



