# Basic DDD Java Boilerplate using Maven

This project is a basic Domain-Driven Design (DDD) boilerplate implemented in Java and built with Maven.<br/>
The example is incomplete and should serve as a starting point to understand how to continue structuring the project.<br/>

## Project Structure

The project follows the DDD architecture and is structured into the following layers:

- `domain`: This layer contains all the business logic. It is independent of the specific details of the infrastructure, user interface, or application.
- `application`: This layer is responsible for driving the workflow of the application, matching the use cases at hand. These operations are independent of the UI and are interfaced out to keep the inward-facing domain model pure.
- `infra`: This layer acts as a supporting library for all the other layers. It provides communication between the layers, data persistence, message sending, etc.


## Building the Project

To build the project, navigate to the project directory and run the following command:

```bash
mvn clean install

```

