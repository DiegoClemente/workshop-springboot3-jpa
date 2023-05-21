Application webservice with Spring Boot and JPA / Hibernate

Sobre o projeto
Aplicação Restful em Spring Boot e JPA, implementando modelo de domínio, estruturas de camada lógica com banco de dados de teste (H2) e banco com persistencia como PostgreSQL. 
Através da aplicação é realizado o popular do banco de dados através do CRUD e tratamento de exceções. 

Ferramentas utilizadas:
  . Spring Boot
  . Apache Tomcat
  . Maven
  . H2 Database
  . Postman
  . PostgreSQL

Modelo de domínio:
![image](https://github.com/DiegoClemente/workshop-springboot3-jpa/assets/22910400/3440de53-6d06-4dc8-b289-3ae0fcf20b2b)


Como executar o projeto:
# clonar repositório
git clone 

# Acessar a pasta do projeto
cd src

# executar o projeto
./mvnw spring-boot:run

# CRUD realizado através da implementação de objetos no Spring ou através de chamadas no serviço pelo Postman usando GET, POST, DELETE, PUT. 
AS requisições ao webservice são realizadas pela URL: http://localhost:8080/{chamada_servico/{id}}
PS: Fazer POST utilizando formato JSON.
![image](https://github.com/DiegoClemente/workshop-springboot3-jpa/assets/22910400/1b66e023-7131-4c14-98af-de1f3aec5274)

# Instância de domínio:
![image](https://github.com/DiegoClemente/workshop-springboot3-jpa/assets/22910400/9919fc21-fb82-464a-8a80-5fc5adafff91)
