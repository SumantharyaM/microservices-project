# Step 1: Use official Maven image to build the app
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (for better caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Step 2: Use smaller JDK image for runtime
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy built JAR file from build stage
COPY --from=build /app/target/user-service-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
