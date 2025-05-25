This project is a Spring Boot-based Social Media Management System designed to simulate the core functionalities of a social networking platform. Through building this application, I gained hands-on experience with Spring Data JPA, relational mappings, and entity lifecycle management.

🔧 Key Features and Learning Highlights:
User Management: Implemented CRUD operations for users using Spring Boot REST controllers.

Relational Mapping:

One-to-One: Between SocialUser and SocialProfile (e.g., each user has a unique profile).

One-to-Many / Many-to-One: Between SocialUser and Post (e.g., a user can have multiple posts).

Many-to-Many: Between SocialUser and SocialGroup (e.g., users can join multiple groups).

Cascade Operations: Explored different CascadeType options like PERSIST, MERGE, REMOVE to manage related entity persistence automatically.

Fetch Strategies:

Used FetchType.LAZY and FetchType.EAGER to optimize data retrieval and prevent performance issues.

JPA Repository Integration: Used Spring Data JPA for data access, simplifying database interactions with predefined methods.

RESTful APIs: Built secure and consistent REST endpoints for interacting with users and related entities.

🛠️ Technologies Used:
Java 17

Spring Boot

Spring Data JPA (Hibernate)

H2 Database

Lombok (for cleaner code)

Postman (for API testing)

