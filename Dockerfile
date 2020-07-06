FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/spring-web-sample-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-web-sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-web-sample-0.0.1-SNAPSHOT.jar"]
