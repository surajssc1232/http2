# HTTP/2 Spring Boot Demo

This is a demo project for Spring Boot and HTTP/2.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK) 11**: You can download it from [AdoptOpenJDK](https://adoptopenjdk.net/).
- **Apache Maven**: You can download it from [Maven](https://maven.apache.org/download.cgi).
- **Git**: You can download it from [Git](https://git-scm.com/downloads).

## Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-username/http2.git
    cd http2
    ```

2. **Install dependencies**:
    ```sh
    ./mvnw clean install
    ```

## Setup

1. **Configure application properties**:
    - Open the [`src/main/resources/application.properties`](src/main/resources/application.properties) file and configure any necessary properties.

2. **Run the application**:
    ```sh
    ./mvnw spring-boot:run
    ```

3. **Access the application**:
    - Open your web browser and navigate to `http://localhost:8080/hello` to see the "Hello" message.

## Project Structure