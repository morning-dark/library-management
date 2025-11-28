# Library Management System (Spring Cloud Microservices)

## Project Description

**Library Management** is a modern, distributed library management system built on a **microservices** architecture using **Spring Boot** and **Spring Cloud**. This project is designed to modularly manage the various aspects of a university or public library.

The microservices architecture allows for high scalability, increased resilience, and independent development of the different services.

## Architecture and Key Services

The project is structured around the following microservices:

| **Service**               | **Role**                                                                                       | **Key Technologies**                       |
|---------------------------|------------------------------------------------------------------------------------------------|--------------------------------------------|
| ```eureka-service```      | **Discovery Server:** Enables microservices to register and discover each other.               | Spring Cloud Netflix Eureka.               |
| ```config-service```      | **Configuration Server:** Centralizes the management of configurations for all microservices.  | Spring Cloud Config.                       |
| ```api-gateway```         | **Gateway API:** Single point of entry for clients, managing routing and security.             | Spring Cloud Gateway.                      |
| ```book-service```        | **Book Management**: Manages book-related information (CRUD).                                  | Spring Boot, Spring Data.                  |
| ```subscriber-service```  | **Subscriber Management:** Manages user/subscriber information.                                | Spring Boot, Spring Data.                  |
| ```loan-service```        | **Loan Management:** Manages book loan and return transactions.                                | Spring Boot, Inter-Service Communication.  |

## Technologies Used

 **Language:** Java.
- **Main Framework:** Spring Boot.
- **Architecture:** Spring Cloud Microservices.
- **Discovery Service:** Spring Cloud Netflix Eureka.
- **Configuration:** Spring Cloud Config.
- **API Gateway:** Spring Cloud Gateway.
- **Build Tool:** Maven.
- **Utilities:** Lombok (likely used for code conciseness).

## Installation and Execution

This project requires the execution of several services. They must be started in a specific order.

### Prerequisites

- JDK (Java Development Kit).
- Apache Maven.
- A version control system (Git).
- A database environment (e.g., H2, MySQL, or MongoDB, depending on the configuration of each service).

### Steps

1. **Clone the Repository:**
```bash
git clone https://github.com/morning-dark/library-management.git
cd library-management
```
2. **Build the Project:** Build all the project modules using Maven.
3. **Starting Services (Recommended Order):**
- **Start the Configuration Server:** ```config-service```.
- **Start the Discovery Server:** ```eureka-service```.
- **Start the Business Services:** ```book-service```, ```subscriber-service```, ```loan-service```.
- **Start the API Gateway:** ```api-gateway```.

## Project Structure

```bash
library-management/
├── pom.xml               # Parent POM (packaging: pom)
├── config-service/       # Configuration Microservice
├── eureka-service/       # Discovery Microservice
├── api-gateway/          # Gateway Microservice
├── book-service/         # Book Management Microservice
├── subscriber-service/   # Loan Management Microservice subscribers
└── loan-service/         # Loan management microservice
```
