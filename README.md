# dockerisingSpringBoot
This web application loads csv file on startup and then exposes API to explore the file.
This project is build using spring boot mvc where the user request for a value associated with the particular id.
Added Dockerfile in the NumberDetails/target folder to build the docker image for the same
Added with cucumber feature file to test the functionality of the business logic
API exposed to : localhost:8080/get/{id}
