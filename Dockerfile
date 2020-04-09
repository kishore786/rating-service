#FROM openjdk:8-jdk-alpine
#LABEL PROJECT_NAME=rating-service \
#      PROJECT=rating-service

#ADD maven/  / 
#RUN echo 'Jar name is' $JAR_FILE \n
#COPY maven/rating-service-0.0.1-SNAPSHOT.jar  app.jar
#EXPOSE 8383 8787
#ENTRYPOINT ["java","-jar","/app.jar"

 FROM busybox
 RUN echo "hello world"
