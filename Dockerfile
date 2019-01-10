FROM maven:3.5.4-jdk-8-slim
WORKDIR /usr/src/java-code
COPY . /usr/src/java-code/
#RUN mvn install:install-file -Dfile=target/jarholder/ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar
RUN mvn clean install -U
WORKDIR /usr/src/java-app
RUN cp /usr/src/java-code/target/*.jar ./app.jar

EXPOSE 8083
#CMD ["java", "-jar", "app.jar"]
#CMD ["java", "-Doracle.net.tns_admin=${TNS_ADMIN}", "-Duser.timezone=GMT", "-jar", "app.jar"]

CMD ["java", "-Duser.timezone=GMT", "-jar", "app.jar"]