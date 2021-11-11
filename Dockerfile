FROM openjdk:17
EXPOSE 8080
ADD target/oracle-host-app.jar oracle-host-app.jar
ENTRYPOINT ["java", "-jar", "oracle-host-app.jar"]
