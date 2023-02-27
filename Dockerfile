FROM openjdk:18
COPY /target/Coffee_House-0.0.1-SNAPSHOT.jar Coffee_House-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Coffee_House-0.0.1-SNAPSHOT.jar"]