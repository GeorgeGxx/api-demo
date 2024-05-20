#
# Build stage
#
ARG APP_NAME=api-demo
FROM openjdk:17-jdk-alpine AS builder
#FROM openjdk:11-jdk-slim AS builder
#FROM maven:3.8.6-openjdk-11-slim AS builder
ARG APP_NAME
WORKDIR /app/$APP_NAME
COPY .env .
COPY .mvn ./.mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/
COPY src ./src
RUN ./mvnw clean package -DskipTests
#COPY pom.xml .
#COPY src ./src
#RUN mvn -f pom.xml clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-alpine
#FROM openjdk:11-jre-slim
ARG APP_NAME
WORKDIR /app
#RUN mkdir ./logs
ARG TARGET_FOLDER=/app/$APP_NAME/target
COPY --from=builder $TARGET_FOLDER/api-demo-0.0.1-SNAPSHOT.jar /usr/local/lib/api-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/api-demo.jar"]