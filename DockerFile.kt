# Use an official base image
FROM openjdk:8-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Gradle files
COPY build.gradle settings.gradle gradlew /app/
COPY gradle /app/gradle

# Copy the source code
COPY app /app/app

# Build the project
RUN ./gradlew assembleDebug

# Expose the port if your app uses one
EXPOSE 8080

# Command to run the application
CMD ["./gradlew", "installDebug"]
ENTRYPOINT ["./gradlew", "installdebug"]


