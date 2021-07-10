FROM openjdk:11.0.10-jre-slim-buster
VOLUME /tmp
COPY /target/learnportal-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
