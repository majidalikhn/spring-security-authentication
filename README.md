# Spring Boot Security API Project

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [Installation](#installation)
5. [Configuration](#configuration)
6. [Usage](#usage)
7. [Contribute](#contribute)
8. [License](#license)

## Introduction

This is a Spring Boot project that comes with pre-configured API authentication using Spring Security. The project is designed to be highly modular and can be easily integrated into other applications. Simply customize the database and user details service configuration, and you're good to go!

## Features

- API Authentication
- Spring Security Integration
- Easy-to-use and Modular
- Extensible and Customizable
- Frontend Apps Integration: CORS, CSRF, and CRLF configurations are pre-set
- Password Encoding: Passwords are securely encoded
- Session Management: Pre-configured for robust session management

## Prerequisites

- Java 8 or higher
- Maven
- MySQL or any other relational database

## Installation

1. Clone the repository
    ```bash
    git clone https://github.com/majidalikhn/spring-security-authentication.git
    ```

2. Navigate into the directory
    ```bash
    cd spring-security-authentication/authentication
    ```

3. Build the project
    ```bash
    mvn clean install
    ```

4. Run the application
    ```bash
    mvn spring-boot:run
    ```

## Configuration

1. **Database Configuration**: Open `application.properties` and set your database credentials.

   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/majoozilla?createDatabaseIfNotExist=true
    spring.datasource.username=admin
    spring.datasource.password=admin
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
    ```

2. **User Details Service**: Customize the user details service according to your needs.

3. **Security Configuration**: CORS, CSRF, and CRLF are already handled. Passwords are encoded and session management is configured for security.

## Usage

The application runs on `http://localhost:8080`.

- **API Endpoints**:
    - `/api/signup`: User registration endpoint
    - `/api/login`: User login endpoint
    - `/api/logout`: User logout endpoint

## Contribute

Feel free to open issues and pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE.md](LICENSE.md) file for details.
