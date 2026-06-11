# SmartLogix - Logistics Management System

## Project Overview

SmartLogix is a Spring Boot based backend application developed as a minor project to demonstrate enterprise backend development concepts such as REST APIs, layered architecture, database integration, CRUD operations, validation, exception handling, DTO pattern, and PostgreSQL connectivity.

The project simulates a logistics management system where users can be managed through RESTful APIs.

---

## Tech Stack

### Backend

* Java 21
* Spring Boot 3.5
* Spring MVC
* Spring Data JPA
* Hibernate ORM

### Database

* PostgreSQL

### Build Tool

* Maven

### Testing Tools

* Postman

### Version Control

* Git
* GitHub

---

## Features Implemented

### User Management Module

#### Create User

* Add new users through REST API.

#### Get All Users

* Retrieve all users from the database.

#### Get User By ID

* Retrieve a specific user using its ID.

#### Update User

* Modify existing user details.

#### Delete User

* Remove a user from the database.

---

## Project Architecture

src/main/java/com/smartlogix/backend

├── controller

├── service

├── repository

├── entity

├── dto

├── exception

└── BackendApplication.java

---

## API Endpoints

### Create User

POST /api/users

Request Body:

{
"name": "Parthiv",
"email": "[parthiv@gmail.com](mailto:parthiv@gmail.com)"
}

---

### Get All Users

GET /api/users

---

### Get User By ID

GET /api/users/{id}

---

### Update User

PUT /api/users/{id}

Request Body:

{
"name": "Updated Name",
"email": "[updated@gmail.com](mailto:updated@gmail.com)"
}

---

### Delete User

DELETE /api/users/{id}

---

## Database Configuration

application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/smartlogix

spring.datasource.username=postgres

spring.datasource.password=postgres123

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

---

## How To Run

### Clone Repository

git clone <repository-url>

### Navigate To Project

cd backend

### Build Project

mvn clean install

### Run Application

mvn spring-boot:run

Server starts on:

http://localhost:8080

---

## Learning Outcomes

This project helped in understanding:

* Spring Boot fundamentals
* REST API development
* Layered Architecture
* Dependency Injection
* JPA & Hibernate
* PostgreSQL Integration
* DTO Pattern
* Validation
* Global Exception Handling
* Maven Build Lifecycle
* Git & GitHub Workflow

---

## Future Enhancements

* Shipment Module
* JWT Authentication
* Spring Security
* Role Based Authorization
* Swagger Documentation
* Docker Containerization
* AWS Deployment

---

## Author

Parthiv Kumar

Minor Project - June 2026
