FROM openjdk:17
EXPOSE 8080
ADD target/cicd-demo-0.0.1-SNAPSHOT.jar cicd-demo.jar
ENTRYPOINT ["java","-jar","cicd-demo.jar"]
