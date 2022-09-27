FROM gradle:6.6.1 as builder
RUN cd /myapp/
ADD . .
RUN ./gradlew clean compileJava build


FROM openjdk:8-jre-alpine3.9
LABEL architecture=x86_64
WORKDIR /myapp
COPY --from=builder /myapp/build/libs/CalculatorAPI-0.0.1-SNAPSHOT.war .
EXPOSE 80
ENTRYPOINT ["java", "-jar", "CalculatorAPI-0.0.1-SNAPSHOT.war"]