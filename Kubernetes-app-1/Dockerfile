#FROM openjdk:8-jdk-alpine
#VOLUMN /tmp
#ARG JAR_FILE
#ADD ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Kubernetes-app-1:0.0.1-SNAPSHOT"]

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar docker-maven-comparison:0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Kubernetes-app-1:0.0.1-SNAPSHOT"]
#EXPOSE 8080

FROM openjdk:8
ADD target/Kubernetes-app-1-micro-v1.jar Kubernetes-app-1-micro-v1.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","Kubernetes-app-1-micro-v1.jar"]

 