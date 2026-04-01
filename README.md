# microservicios-futfem-matchdayteamlocal

`microservicios-futfem-matchdayteamlocal` is responsible for the home team context on matchday workflows inside the Tikitakas backend. It provides a dedicated service boundary for local-side matchday team data, allowing the application to keep event-specific team state independent from the generic team catalog.

The codebase uses Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. Shared CRUD behavior comes from `microservicios-common`, while Eureka and the gateway provide service discovery and external routing. This keeps the service consistent with the rest of the architecture and makes local, CI, and Docker-based execution predictable.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/matchdayteamlocal/**`

For `v0.1.0`, the repository has been aligned with the platform-wide standards for testing, Docker image generation, Jenkins pipelines, and gateway-aware Swagger/OpenAPI publication. That means the API docs can be opened centrally from the gateway without broken server URLs.

This microservice is useful when matchday-local team information needs to evolve with its own lifecycle, separate persistence, and dedicated REST endpoints rather than being mixed into a broader team management service.
