# atplay-holdings
At Play Holdings Client Information Management System

#The Solution is a Spring Boot Micro Service (REST API)

#It has one the following endpoints:

localhost:8080/client
Method: POST
Description: Add a new client.

localhost:8080/clients
Method: GET
Description: Fetches all clients from the database.

localhost:8080/client/{clientId}     // client id here is passed as a PathVariable
Method: GET
Description: Fetches a single client using client id.

#How to deploy the API

#Build and run with maven using the below command inside the root of the project with a terminal, cmd, or git bash

mvn clean install spring-boot:run

#Swagger UI for calling the endpoints after the API has been deployed locally.

localhost:8080/swagger-ui.html


