FROM openjdk:8
EXPOSE 8080
ADD target/Order-service.jar Order-service.jar 
ENTRYPOINT ["java","-jar","/Order-service.jar"]