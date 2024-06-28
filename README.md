# Spring Boot REST API Project


### Installing

Clone the repository to your local machine:


git clone this repo

cd SpringREST

//run springboot app
./mvnw clean install

./mvnw spring-boot:run

Application should now be running and accessible at http://localhost:8080

**API Endpoints**:

Check these in Postman
1. [ POST ] at http://localhost:8080/api/user/register
2. [ GET ]  at http://localhost:8080/api/user/fetch
3. [ GET ] fetch using userID http://localhost:8080/api/user/fetch/{userID}
4. [ GET ] fetch using username http://localhost:8080/api/user/fetchByUsername?username={name}

Changes are reflected in connected MySQL database.
