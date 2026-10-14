# Student Manager

Student Manager is a Spring Boot application for registering and managing
students. It uses Thymeleaf for the web interface, Spring Data JPA for
persistence, and an in-memory H2 database for local development.

## Run the application

Requirements:

- Java 17 or newer

From the project directory, run:

```powershell
.\mvnw.cmd spring-boot:run
```

Then open <http://localhost:8080>.

The test suite can be run with:

```powershell
.\mvnw.cmd test
```
