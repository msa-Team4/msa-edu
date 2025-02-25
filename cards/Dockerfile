FROM --platform=linux/amd64 eclipse-temurin:21-jdk
WORKDIR /app
COPY target/cards.jar app.jar
CMD ["java", "-jar", "app.jar"]
