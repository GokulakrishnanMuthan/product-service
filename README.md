# Product Service

Product Service is a Spring Boot microservice responsible for managing product data.  
It provides product details to other services (like Order Service) and registers itself with **Eureka Server** for service discovery.  
Requests are routed through the **API Gateway**.

---

## 🚀 Features
- Manage product catalog (CRUD operations)
- Provide product details to Order Service
- Register with Eureka for service discovery
- Exposed through API Gateway routes (`/products/**`)

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring WebFlux / Spring MVC**
- **Spring Data JPA / R2DBC**
- **MySQL** (for product database)
- **Spring Cloud Netflix Eureka Client**
- **Spring Cloud Gateway**

---

## ⚙️ Configuration

### `application.properties`
```properties
spring.application.name=PRODUCT-SERVICE
server.port=8081

# Database
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Eureka
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
