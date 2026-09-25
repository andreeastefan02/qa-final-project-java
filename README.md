# QA Final Project - Java

## Project Description

This project is a Java/Maven QA project configured with Docker and a CI/CD pipeline using GitHub Actions.

The project contains an API test written in pseudocode. The test verifies that a GET request to the JSONPlaceholder API returns a `200` status code and that the response contains a `title` field.

## API Test

The API test is located in:

`src/test/java/com/andreeastefan02/tests/ApiTest.txt`

The test logic is:

- Send a `GET` request to `https://jsonplaceholder.typicode.com/todos/1`
- Verify that the response status code is `200`
- Verify that the response contains a `title`

The test is currently written in pseudocode because Java test implementation has not been covered yet.

## Running Tests Locally

Maven is used to run the tests.

Run:
mvn test
