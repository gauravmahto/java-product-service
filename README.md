# java-product-service
E-commerce Application with Spring Boot

┌───────────────────────────────────┐
│          API Gateway              │
│            (:8080)                │
└───────────────┬───────────────────┘
                │
    ┌───────────┼───────────┐
┌───▼───┐   ┌───▼───────┐ ┌─▼───────────┐
│Product│   │Discovery  │ │Config Server│
│Service│   │(Eureka)   │ │             │
│:8081  │   │:8761      │ │:8888        │
└───────┘   └───────────┘ └─────────────┘
