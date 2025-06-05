
This is a backend project I built to simulate some of the key features you’d expect in a social networking app. It gave me the chance to dive deep into Spring Boot, JPA, and how to handle real relational data structures with confidence.

🔍 What This Project Does
This system manages:

Users and their profiles

User-created posts

Groups users can join

It supports:

Full CRUD operations

Different types of entity relationships (One-to-One, One-to-Many, Many-to-Many)

Clean and secure REST APIs

🧠 What I Learned
This project wasn’t just about writing code—it really helped me get hands-on with:

Entity Relationships
Like how a SocialUser connects to a SocialProfile, or how posts and groups work behind the scenes with JPA.

Cascade Operations
Learned how JPA handles saving or deleting related entities automatically using PERSIST, MERGE, and REMOVE.

Lazy vs Eager Loading
Figured out how to optimize performance by loading only what’s needed, when it’s needed.

Building RESTful APIs
Designed endpoints that are clean, easy to use, and tested them all in Postman.

🛠 Tech Stack
Java 17

Spring Boot

Spring Data JPA (Hibernate)

H2 Database (in-memory)

Lombok

Postman for testing APIs

🚀 How to Run It Locally
Clone the repo:
Run the app using Maven:
H2 Console: http://localhost:8080/h2-console

Your API endpoints (test them using Postman)

🙌 Open to Feedback & Collaboration
I built this project as a way to practice and grow, and I’d love to hear what you think! Whether you’re working on something similar or just want to connect, feel free to reach out.

📫 [www.linkedin.com/in/hemant-kumar-java]
🧑‍💻 Let’s build something together!

💡 Bonus Ideas for the Future
Some things I’m thinking of adding next:

Spring Security + JWT

Frontend integration ( React )

Pagination and filtering on posts

Uploading images or media
