# Spring Boot on Docker connecting to MySQL Docker container

1. Use MySQL Image published by Docker Hub (https://hub.docker.com/_/mysql/)
Command to run the mysql container
`docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:{version that u had}

2. In the Spring Boot Application, use the same container name of the mysql instance in the application.properties
`spring.datasource.url = jdbc:mysql://mysql-standalone:3306/test`

3. Create a `Dockerfile` for creating a docker image from the Spring Boot Application at the same level of pom.xml file .
- FROM openjdk:8
- ADD target/users-mysql.jar users-mysql.jar
- EXPOSE 8086
- ENTRYPOINT ["java", "-jar", "users-mysql.jar"]

4. Using the Dockerfile create the Docker image.
From the directory of Dockerfile - `docker build . -t 'name of the jar '`

5. Run the Docker image (that u created) for example #4.
 `docker run -p 8086:8086 --name users-mysql.jar --link mysql-standalone:mysql -d users-mysql.jar`
 `docker run -p <port>:<port> --name <imageName> --link <name of the container for mysql>:mysql -d <imagename>`
 - and the application should be running :) 
## Useful Docker commands
- `docker images`
- `docker container ls`
- `docker logs <container_name>`
- `docker container rm <container_name`
- `docker image rm <image_name`
