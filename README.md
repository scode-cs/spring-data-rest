# Spring Data REST

Spring Data Rest with Spring Doc, H2 Database and Flyway

## Requirements

For building and running the application mentioned setup is required

- JDK 17
- Maven 3

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.sdev.springdata.application.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Database and schema

No database need to be installed, this application will run on H2 and flyway is used for the DDL and DML operations
```
H2 Database with Flyway script
```

## Important Links

- [Spring data rest](https://docs.spring.io/spring-data/rest/docs/current/reference/html/)
- [Spring Doc for data rest](https://springdoc.org/#spring-data-rest-support)


## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.
