FROM openjdk:8u151-jre-alpine

LABEL version="1.0"

COPY target/*.jar java-codenation.jar

VOLUME [ "/root" ]

ENTRYPOINT [ "/usr/bin/java", "-jar", "java-codenation.jar"]


