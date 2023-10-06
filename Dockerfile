FROM openjdk:8

ADD target/samreen-springboot-docker.jar samreen-springboot-docker.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","samreen-springboot-docker.jar"]