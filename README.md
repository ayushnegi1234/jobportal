# Job Portal

A Spring Boot backend project for a simple job portal application. It exposes REST APIs for company data and contact requests, uses MySQL for persistence, and initializes database schema/data from SQL files under `src/main/resources/sql`.

## Tech Stack

- Java 25
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven
- Docker Compose
- Lombok

## Features

- Fetch company details through the companies API.
- Save contact requests through the contacts API.
- Request validation with Jakarta Validation.
- Centralized exception handling.
- Docker Compose configuration for a local MySQL database.

## API Endpoints

- `GET /companies` - returns the list of companies.
- `POST /contacts` - saves a contact request.
- `GET /contacts?status=...` - fetches contacts by status parameter.

## Run Locally

Make sure Docker is running, then start the application:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The app uses the following default database settings:

- Host: `localhost`
- Port: `3306`
- Database: `jobportal`
- Username: `root`
- Password: `root`

These can be changed with environment variables such as `DATABASE_HOST`, `DATABASE_PORT`, `DATABASE_NAME`, `DATABASE_USERNAME`, and `DATABASE_PASSWORD`.
