FROM openjdk:8-jdk-alpine
LABEL PROJECT_NAME=order-service \
      PROJECT=order-service
# In maven/ the files as specified in the <assembly> section is stored
# and need to be added manually
ADD maven/  / 
RUN echo 'Jar name is' $JAR_FILE \n
COPY maven/review-service-0.0.1-SNAPSHOT.jar  app.jar
EXPOSE 8383 8787
ENTRYPOINT ["java","-jar","/app.jar"]
