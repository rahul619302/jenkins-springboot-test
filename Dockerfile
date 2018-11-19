FROM openjdk:8
ADD target/JenkinsSpringBootTest.jar JenkinsSpringBootTest.jar
EXPOSE 9067
ENTRYPOINT ["java","-jar","JenkinsSpringBootTest.jar"]