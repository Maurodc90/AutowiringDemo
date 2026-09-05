# AutowiringDemo

Spring Boot project demonstrating dependency injection with autowiring, qualifier-based injection, and component scanning.

## What it demonstrates

### Qualifier Demo
- `MessageSender` interface with two implementations: `EmailSender` and `SmsSender`
- `NotificationService` uses `@Qualifier` to inject both senders and send messages through multiple channels

### Greeting Demo
- `GreetingService` interface implemented by `TimeBasedGreetingService`
- `MessageService` stores the user's name, injected into `TimeBasedGreetingService` via constructor injection
- Generates a personalized greeting based on the current time of day (morning, afternoon, evening)

## Key concepts
- `@Component` / `@Service` — marks classes as Spring-managed beans
- `@Autowired` — constructor injection for automatic dependency wiring
- `@Qualifier` — resolves ambiguity when multiple beans implement the same interface
- `@SpringBootApplication` — includes `@Configuration` and `@ComponentScan` automatically

## Tech
- Java 26
- Spring Boot 4.1.1
- Gradle
