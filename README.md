SQL_Servers

Aplicação Java para conexão e operações com Microsoft SQL Server utilizando JDBC.

Projeto criado para estudos, testes e demonstração de boas práticas de acesso a banco de dados relacional em Java.

📋 Sobre o Projeto

Este é um projeto Maven simples (ou com Spring Boot, dependendo da sua implementação) focado em:

- Estabelecer conexão estável com SQL Server
- Executar consultas (SELECT, INSERT, UPDATE, DELETE)
- Tratar exceções comuns (conexão, SQL, timeout, etc.)
- Usar configurações externas (application.properties)
- Evitar SQL Injection com PreparedStatement
- (Opcional) Implementar camadas básicas: model, repository, service

🚀 Tecnologias

- Java 17+ (ou 21)
- Maven 3.8+
- Microsoft JDBC Driver for SQL Server (com.microsoft.sqlserver:mssql-jdbc)
- SLF4J + implementação de log (Logback ou similar)
- JUnit 5 (para testes)
- Banco de dados: Microsoft SQL Server (local, Express, Azure SQL, etc.)

⚙️ Pré-requisitos

- Java JDK 17 ou superior
- Maven instalado
- SQL Server rodando (porta 1433 padrão)
- Banco de dados criado + usuário com permissões

🔧 Configuração Rápida

1. Clone ou abra o projeto

```bash
cd "C:\Desenvolvimento Java\SQL_Servers\SQL_Servers"
