# Step 1: Use an official lightweight Java 17 runtime base image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled JAR file from the local target directory to the container
COPY target/*.jar app.jar

# Step 4: Specify the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]