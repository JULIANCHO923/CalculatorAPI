FROM openjdk:8-jre-alpine3.9
WORKDIR /myapp/
COPY build/libs/calculadoraAPI-0.0.1-SNAPSHOT.war .
EXPOSE 80
ENTRYPOINT ["java", "-jar", "calculadoraAPI-0.0.1-SNAPSHOT.war"]
