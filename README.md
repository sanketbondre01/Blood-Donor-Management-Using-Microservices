📌Project Overview

The Blood Donor Management System is a microservices-based application built using Spring Boot and Spring Cloud. It manages blood donors, blood availability, and requests while integrating monitoring and documentation tools.
Technologies Used

->Spring Boot (Microservices Development)

->Spring Cloud + Eureka Server (Service Discovery)

=>Spring Data JPA + MySQL (Database)

->Swagger / OpenAPI (API Documentation & Testing)

->Prometheus + Grafana (Monitoring & Visualization)

->Zipkin (Distributed Tracing)

->Features:

Donor Service – Add, update, delete donors; search by blood group or city

Blood Service – Manage blood records and link with donors

Request Blood Service – Create and track blood requests, link requests with blood availability

Notification Service – Generate notifications for requests

Eureka Server – Service registration & discovery

Swagger – Interactive API docs (/swagger-ui.html)

Monitoring – Prometheus & Grafana dashboards

->Access APIs

Swagger Docs: http://localhost:{port}/swagger-ui.html

Eureka Dashboard: http://localhost:8761

Prometheus: http://localhost:9090

Grafana: http://localhost:3000

Zipkin: http://localhost:9411

Tracing – Zipkin request tracking

📊 API Tools

Swagger UI – Test APIs directly from browser

Postman – Alternative API testing

Prometheus & Grafana – Monitor API calls and service health

Zipkin – Track request flows across microservices
