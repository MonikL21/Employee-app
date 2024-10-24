# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application jar file to the container
COPY target/Employee-0.0.1-SNAPSHOT.jar /app/employee-app.jar

# Expose the port your Spring Boot application will run on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/employee-app.jar"]
