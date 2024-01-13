FROM openjdk:19
ADD /target/ProjectService.jar backend.jar
ENTRYPOINT ["java","-jar", "backend.jar"]