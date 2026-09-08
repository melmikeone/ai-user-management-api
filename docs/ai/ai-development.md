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

| Activity | Without AI | With AI | Estimated saving |
|---|---:|---:|---:|
| Architecture | - | - | - |
| Implementation | - | - | - |
| Tests | - | - | - |
| Code review | - | - | - |
| Documentation | - | - | - |

---

## Final Assessment

To be completed after the Pull Request has been merged.
