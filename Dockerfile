FROM openjdk:8-jre-alpine

MAINTAINER UPMC-Enterprises

WORKDIR /opt/app/sample-target

COPY ./build/libs/sample-target-0.0.1-SNAPSHOT.jar sample-target-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","sample-target-0.0.1-SNAPSHOT.jar"]
