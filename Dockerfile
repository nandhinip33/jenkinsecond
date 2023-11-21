FROM eclipse-temurin:17
COPY target/jenkinsecond.jar jenkins.jar
CMD [ "java","-jar","jenkinsecond.jar" ]