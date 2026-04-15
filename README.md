# 🧩 Board - Sistema de Gerenciamento

## 📌 Sobre o projeto
O **Board** é uma aplicação backend desenvolvida em Java com foco em gerenciamento de tarefas no estilo Kanban.

O sistema permite organizar atividades em colunas, facilitando o acompanhamento do fluxo de trabalho.

---

- Java
- JDBC
- Liquibase
- PostgreSQL (ou outro banco relacional)
- Lombok

---

## 🏗️ Arquitetura

O projeto segue uma estrutura simples e organizada em camadas:

- **Config** → configuração de conexão com banco
- **Persistence** → acesso a dados (DAO / Repository)
- **Migration** → controle de versionamento do banco com Liquibase
- **Domain** → regras de negócio (se houver)

---