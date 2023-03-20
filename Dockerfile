FROM openjdk:17

ADD build/libs/*.jar app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app"]