# syntax=docker/dockerfile:1

FROM openjdk:17
COPY ./target/devops-integration-jar-with-dependencies.jar ./
WORKDIR ./
#ADD target/devops-integration-jar-with-dependencies.jar devops-integration-jar-with-dependencies.jar
CMD ["java","-jar","/devops-integration-jar-with-dependencies.jar"]