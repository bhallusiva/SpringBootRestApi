# Spring Boot REST API – CRUD Practice

This is a small hands-on practice project developed to understand the basics of **REST APIs using Spring Boot**.

Through this project, I implemented the basic **CRUD operations** for managing products using different HTTP methods.

## What I Practiced

| Operation            | HTTP Method | Description                     |
| -------------------- | ----------- | ------------------------------- |
| Add Product          | `POST`      | Add a new product               |
| Get Product by ID    | `GET`       | Retrieve a product using its ID |
| Update Product       | `PUT`       | Update an existing product      |
| Delete Product by ID | `DELETE`    | Delete a product using its ID   |

## REST API Endpoints

### 1. Add Product

```http
POST /Products
```

Used to add a new product.

### 2. Get Product by ID

```http
GET /Products/{prodId}
```

Used to retrieve a specific product using its product ID.

### 3. Update Product

```http
PUT /Products
```

Used to update an existing product.

### 4. Delete Product by ID

```http
DELETE /Products/{prodId}
```

Used to delete a specific product using its product ID.

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven
* REST API

## Key Concepts Learned

* Understanding REST APIs
* HTTP methods: `GET`, `POST`, `PUT`, `DELETE`
* Creating REST controllers using `@RestController`
* Mapping endpoints using `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`
* Using `@PathVariable`
* Handling HTTP requests and responses
* Basic CRUD operations in Spring Boot
* Understanding the flow between Controller, Service, and Model layers

## Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.SpringWeb
    │       ├── Controller
    │       │   ├── HomeController.java
    │       │   └── ProductController.java
    │       ├── Model
    │       │   └── Product.java
    │       ├── Service
    │       │   └── ProductService.java
    │       └── SpringWebApplication.java
    │
    └── resources
        └── application.properties
```

## Purpose

The main purpose of this project was to gain **practical experience with Spring Boot REST API development** and understand how different HTTP methods are used to perform CRUD operations.

This project serves as a foundation for building more advanced **Spring Boot backend applications** in the future.
