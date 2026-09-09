# AI-Assisted Development

## Project

AI User Management API

## AI Assistant

GitHub Copilot

## Purpose

This document records how artificial intelligence was used
during the development of the project.

The objective is to document how AI contributed to the
development process and how it accelerated the work.

---

## AI Usage Log

### Session 1 - Project Architecture

**Objective**

Understand the responsibilities of the main application layers.

**Prompt**

> Explícame brevemente la estructura actual de este proyecto
> Spring Boot y qué responsabilidad debería tener cada una de
> las capas controller, service, domain y repository.
> No escribas código.

**AI contribution**

The AI assistant analyzed the possible locations for the email
validation rule and compared the Controller, Service and Domain
layers.

It identified the main trade-offs related to coupling,
testability, reuse and domain responsibility.

The assistant recommended implementing the validation in the
domain layer.

**Developer decision**

The recommendation was reviewed and accepted.

The final decision was to implement email validation in the
domain layer because email validity is considered a business
rule of the User domain object and should not depend on the
HTTP layer.

The decision has been documented in:

`docs/adr/001-email-validation.md`

The AI-generated analysis was used as input for the architectural
decision, but the final decision and ADR were reviewed and written
by the developer.

````markdown
## Session 2 - TDD and Implementation

### Objective

Implement the User domain object according to the behaviour defined
by the unit tests.

### AI contribution

The AI assistant was used to propose an initial implementation of
the `User` domain object based on the tests.

The prompt explicitly instructed the assistant not to modify the
tests and to keep the implementation within the domain layer.

The generated implementation was reviewed manually and executed
against the test suite.

### Developer validation

The implementation was not accepted blindly.

The developer reviewed:

- validation logic;
- exception handling;
- code complexity;
- adherence to the ADR;
- test coverage.

The complete test suite was executed using Maven.

### Code review with AI

The AI assistant was subsequently used as a Senior Java Developer
to review the implementation.

The review focused on:

- separation of responsibilities;
- edge cases;
- null handling;
- readability;
- maintainability;
- test quality.

The recommendations were evaluated by the developer before making
any changes.

### TDD result

The development followed the RED → GREEN cycle:

```text
RED
Tests were created before the User implementation.

GREEN
The User implementation was created and the tests passed.

REFACTOR
The implementation was reviewed for simplicity and maintainability.
````

```
```

### Session 3 - User creation service

**Objective**

Implement the application service responsible for creating users.

**AI contribution**

GitHub Copilot was used to propose the initial implementation
of UserService based on the existing UserServiceTest and
UserRepository abstraction.

The AI was explicitly instructed not to modify the tests and
not to introduce a database or controller.

**Developer validation**

The generated implementation was reviewed manually to verify:

- dependency injection;
- separation of responsibilities;
- adherence to ADR-001;
- correct use of UserRepository;
- absence of unnecessary complexity;
- test compatibility.

The implementation was validated by running the complete Maven
test suite.

**Testing approach**

Mockito was used to mock UserRepository and isolate UserService
from persistence concerns.

### Session 4 - AI Code Review

**Objective**

Review the complete email validation feature before creating
the Pull Request.

**AI contribution**

GitHub Copilot was used as a Senior Java Developer to review
the implementation.

The review covered:

- separation of responsibilities;
- adherence to ADR-001;
- code readability;
- service and repository design;
- Controller implementation;
- HTTP error handling;
- unit and integration tests;
- Mockito usage;
- edge cases;
- maintainability.

A second review focused specifically on robustness and
unexpected input.

**Developer validation**

The AI recommendations were reviewed manually by the developer.

Recommendations were not applied automatically. Each finding
was evaluated according to:

- relevance to the current feature;
- architectural impact;
- consistency with ADR-001;
- complexity;
- project scope.

Only changes considered justified by the developer were applied.

**Result**

The complete Maven test suite was executed after the review
and all tests passed.

---

## Development Tasks

| Task | AI assistance | Developer validation |
|---|---|---|
| Architecture analysis | Pending | Pending |
| Feature design | Pending | Pending |
| Implementation | Pending | Pending |
| Unit tests | Pending | Pending |
| Code review | Pending | Pending |
| Documentation | Pending | Pending |

---

## Estimated Time Savings

To be completed after the feature has been implemented.

| Actividad              |  Sin IA | Con IA | Ahorro estimado |
| ---------------------- | ------: | -----: | --------------: |
| Diseño de arquitectura |  60 min | 25 min |          35 min |
| Diseño de tests        |  45 min | 20 min |          25 min |
| Implementación         | 120 min | 55 min |          65 min |
| Code Review            |  45 min | 20 min |          25 min |
| Documentación          |  45 min | 15 min |          30 min |


---

## Final Assessment

To be completed after the Pull Request has been merged.
