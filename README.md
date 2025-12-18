# 📝 Your Tasks
## Task 1: Containerize the Web Application
- Create a Dockerfile for the Java application.
- Goal: Compile the code using Maven, package it into a JAR, and run it.
- Constraint: Use a Multi-stage build (build in one container, run in a smaller one).

## Task 2: Infrastructure as Code
- Create a docker-compose.yml file.
- Service 1 (library-db): Use mcr.microsoft.com/mssql/server:2022-latest.
- Service 2 (library-web): Your Java app. It must run on port 8080 and connect to library-db.
- Service 3 (db-init): A container that runs the provided schema.sql against the database to create the tables.

## Task 3: Configuration
- Configure the Java app to point to the library-db container (override the default localhost settings).
- Ensure the Web App does not crash while waiting for the Database to start.

# ✅ Definition of Done
- Run docker compose up --build.
- Open your web browser to http://localhost:8080.
- You see a styled HTML page with a "Library Books" table.
- You can fill out the "Add Book" form on the page, click Submit, and the page refreshes showing the new book in the table.