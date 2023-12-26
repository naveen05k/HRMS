# Spring Boot JWT Authentication example with Spring Security & Spring Data JPA

## User Registration, User Login and Authorization process.
The diagram shows flow of how we implement User Registration, User Login and Authorization process.

## Dependency
 MySQL:
```xml
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>

```
- For MySQL
```
spring.datasource.url=jdbc:mysql://localhost:3306/testdb_spring?useSSL=false
spring.datasource.username=root
spring.datasource.password=123456

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

# App Properties
bezkoder.app.jwtSecret= ======================BezKoder=Spring===========================
bezkoder.app.jwtExpirationMs=86400000
```
## Run Spring Boot application
```
mvn spring-boot:run
```

=
