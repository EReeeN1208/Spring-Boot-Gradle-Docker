FROM eclipse-temurin:22
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Xmx1536g", "-jar", "/app.jar"]
EXPOSE 8080
