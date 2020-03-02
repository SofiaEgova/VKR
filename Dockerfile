FROM openjdk:8
ADD target/main.jar main.jar
ENTRYPOINT ["java","-jar","main.jar"]