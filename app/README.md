# ride_share

## Phase 1: Monolithic MVP
### Objective:
Get a simple end-to-end system working in a monolithic architecture.

### Features:
- User Registration & Authentication
- Drivers Registering Their Location
- Riders Requesting a Ride
- Matching Riders to Drivers (Naive Logic – nearest driver)
- Trip Status Updates (Started, Completed)

### Key Technologies:
- Spring Boot (REST APIs)
- PostgreSQL
- Hibernate / JPA
- In-memory Data Structures (e.g., ConcurrentHashMap) for Driver Locations
- REST Template for internal service calls

### Key Challenges:
- CRUD Operations with Spring Boot
- Basic Concurrency Handling (e.g., Assigning the same driver to multiple riders)

## User registration & authentication

1. I need a database. lol