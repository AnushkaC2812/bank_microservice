#start with a base image containing java runtime
FROM openjdk:17-jdk-slim

#info around who maintains the image
MAINTAINER anushka

#add the application's jar to the image
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]