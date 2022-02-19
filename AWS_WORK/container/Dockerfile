FROM amazoncorretto:11-alpine-jdk
EXPOSE 8080
RUN mkdir /app
COPY target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]