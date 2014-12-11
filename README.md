revenda-veiculos
================

Revenda de Veiculos - Projeto TCC

'Projeto de conclusão de curso, objetivo desse projeto é resolver os problemas de paradigma objeto-relacional, utilizando tecnologias de ponta como framework ORM, especificamente para este projeto o framework Hibernate, no projeto descrito será citado alguns outros como eclipseLink, o DJango (da linguagem python) que também tem outras funcionalidades como MVC, NHibernate (C#) e outros...

# Tecnologias utilizadas

- Java 7
- Mysql
- Postgre
- Oracle
- Spring MVC
- Spring Security
- Spring IoC ID
- JPA e Hibernate (principal assunto)
- Bootstrap
- AngularJS
- Tomcat 8

# Arquitetura do projeto.

- MVC 
  - view ==> controller ==> service ==> dao ==> database
  
  # Alteracoes de BD
  
  - persistence.xml add o persistence-unit do BD 
  - servlet-context.xml add o DataSource do BD
  - AbstractGenericDao no @PersistenceContext(unitName="mysql_r") do EntityManager 
     alterar o unitName para o nome do persistence.xml adicionado! 
