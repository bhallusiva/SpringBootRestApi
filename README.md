# ☕ Spring Boot REST API

A hands-on Java backend project built to understand how **REST APIs and CRUD operations are implemented using Spring Boot**.

The project focuses on clean separation between controller, service and model responsibilities and serves as a foundation for more advanced Spring Boot applications.

## 🚀 Features

- Create a product
- Retrieve a product by ID
- Update a product
- Delete a product by ID
- RESTful HTTP method mapping
- Controller → Service → Model flow

## 🔌 API Endpoints

| Operation | Method | Endpoint |
|---|---|---|
| Create product | POST | `/Products` |
| Get product | GET | `/Products/{prodId}` |
| Update product | PUT | `/Products` |
| Delete product | DELETE | `/Products/{prodId}` |

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Web
- Maven
- REST APIs

## 📁 Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com.example.SpringWeb/
    │       ├── Controller/
    │       ├── Model/
    │       ├── Service/
    │       └── SpringWebApplication.java
    └── resources/
        └── application.properties
```

## 🧠 Concepts Practiced

- `@RestController`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@PathVariable`
- HTTP request/response handling
- CRUD architecture
- Layered backend structure

## 🎯 Purpose

This project is part of my progression toward **Java backend development** and provides the foundation for adding persistence, validation, DTOs, exception handling, Spring Data JPA and Spring Security.

## 👨‍💻 Author

**Siva Bhallu** — [GitHub](https://github.com/bhallusiva)
