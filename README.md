````markdown
# AI User Management API

REST API developed as part of a software engineering practice focused on
AI-assisted development.

## Objective

The objective of this project is to demonstrate a complete software
development workflow using an AI assistant, including:

- Feature development
- Test-driven development
- Unit testing
- Git branching
- Pull Request
- Code Review
- Architecture Decision Record (ADR)
- AI-assisted development documentation
- Pull Request merge

## Technology Stack

- Java 21
- Spring Boot
- Maven
- JUnit 5
- Mockito
- Git
- GitHub
- VS Code
- AI coding assistant

## Project Structure

```text
src/
├── main/
│   └── java/
│       └── com/example/users/
│           ├── controller/
│           ├── domain/
│           ├── service/
│           └── repository/
│
└── test/
    └── java/
        └── com/example/users/

docs/
├── adr/
└── ai/
````

## Running the application

### Windows

```powershell
.\mvnw.cmd spring-boot:run
```

### Linux / macOS

```bash
./mvnw spring-boot:run
```

## Running tests

### Windows

```powershell
.\mvnw.cmd test
```

### Linux / macOS

```bash
./mvnw test
```

## Development workflow

The project follows a feature-branch workflow:

```text
main
  |
  +-- feature/email-validation
             |
             +-- implementation
             +-- tests
             +-- ADR
             +-- AI documentation
             |
             +-- Pull Request
                       |
                       +-- Code Review
                       |
                       +-- Merge
```

## AI Usage

An AI assistant will be used during different stages of development.

The use of AI will be documented in:

```text
docs/ai/ai-development.md
```

Architecture decisions will be documented as ADRs in:

```text
docs/adr/
```

```
```
