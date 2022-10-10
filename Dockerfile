FROM gradle:6.6.1 as appbuilder
ARG APP_VERSION
WORKDIR /myapp/
COPY . .
RUN ./gradlew clean compileJava build


FROM gcr.io/distroless/java11-debian11
ARG APP_VERSION
LABEL architecture=x86_64 \
      name=calculator_api 
WORKDIR /myapp/
COPY --from=appbuilder myapp/build/libs/CalculatorAPI-${APP_VERSION}.war ./CalculatorAPI.war
EXPOSE 80
COPY --from=appbuilder  myapp/src/main/resources/healthcheck/ .
HEALTHCHECK --interval=15s --timeout=10s --start-period=45s --retries=3 CMD ["java", "HealthCheck.java", "||", "exit", "1"]
ENTRYPOINT ["java", "-jar", "CalculatorAPI.war"]