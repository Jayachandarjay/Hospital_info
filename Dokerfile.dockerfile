# Use official OpenJDK image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the port
EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "target/Hospital_info-0.0.1-SNAPSHOT.jar"]
