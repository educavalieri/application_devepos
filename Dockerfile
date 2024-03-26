FROM openjdk:11
EXPOSE 8080
ADD target/application_dev.jar application_dev.jar
ENTRYPOINT ["java", "-jar", "/application_dev.jar"]