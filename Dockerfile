FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/classes /app

CMD ["java", "com.example.Main"]