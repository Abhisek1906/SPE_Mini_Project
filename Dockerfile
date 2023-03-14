# syntax=docker/dockerfile:1

FROM openjdk:17
EXPOSE 8080
ADD target/devops-integration-jar-with-dependencies.jar devops-integration-jar-with-dependencies.jar
ENTRYPOINT ["java","-cp","/devops-integration-jar-with-dependencies.jar"]