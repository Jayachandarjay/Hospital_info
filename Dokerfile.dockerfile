# Stage 1: Build
FROM eclipse-temurin:24-jdk-jammy AS build
WORKDIR /app

# Copy project files
COPY . .

# Make Maven wrapper executable (important for Render)
RUN chmod +x mvnw

# Build the application (skip tests)
RUN ./mvnw clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:24-jre-jammy
WORKDIR /app

# Copy built JAR from previous stage
COPY --from=build /app/target/Hospital_info-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Render expects
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "app.jar"]
