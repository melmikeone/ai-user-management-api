# ADR-001: Email validation in the domain layer

## Status

Accepted

## Date

2026-09-08

## Context

The User Management API needs to validate the email address
when creating a new user.

An invalid email address should not be accepted by the application.

The application follows a layered architecture composed of:

- Controller
- Service
- Domain
- Repository

We need to decide where the email validation rule should be
implemented.

The main alternatives considered are:

1. Controller layer
2. Service layer
3. Domain layer

## Decision

Email validation will be implemented in the domain layer.

The `User` domain object will be responsible for maintaining
the validity of its email address.

The Controller will be responsible for HTTP concerns.

The Service will coordinate the application use case.

The Repository will be responsible for persistence.

The domain layer will contain the business rule related to
the validity of the user email.

## Alternatives considered

### Alternative 1: Controller layer

The email would be validated directly in the REST controller.

#### Advantages

- Simple to implement.
- Easy to understand initially.
- Validation happens before entering the service layer.

#### Disadvantages

- Business logic becomes coupled to HTTP.
- Other entry points could bypass the validation.
- The rule is harder to reuse.
- Testing the business rule becomes coupled to the web layer.

### Alternative 2: Service layer

The email would be validated by `UserService`.

#### Advantages

- The rule is independent from HTTP.
- Easy to test with unit tests.
- Keeps controllers relatively simple.

#### Disadvantages

- The domain object itself would not guarantee its validity.
- Other code could potentially create an invalid User object.
- Business rules become concentrated in the service layer.

### Alternative 3: Domain layer

The email validity rule is implemented as part of the domain model.

#### Advantages

- The business rule belongs to the object it describes.
- The rule is independent from HTTP.
- The rule can be reused by different application entry points.
- The domain object can maintain its own invariants.
- The rule can be tested independently.

#### Disadvantages

- Requires slightly more domain modelling.
- The application needs to define clearly what constitutes
  a valid email.

## Consequences

### Positive consequences

- The email validation rule is independent from the REST API.
- The domain model has greater responsibility for maintaining
  its own validity.
- The validation can be tested independently.
- Future application entry points can reuse the same rule.

### Negative consequences

- The domain model becomes slightly more complex.
- We need to define and maintain the email validation rule.
- Additional unit tests are required.

## Validation strategy

The implementation will initially focus on basic email format
validation required by the application's acceptance criteria.

It will not attempt to determine whether an email address actually
exists or whether a mailbox can receive messages.

## Related feature

Feature branch:

`feature/email-validation`

## Related tests

Unit tests will cover:

- valid email
- email without `@`
- email without domain
- empty email
- null email
