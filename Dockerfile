FROM openjdk:17-jdk-slim

EXPOSE 8081

ADD target/SpringBootAuthorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]

#ENTRYPOINT ["top", "-b"]