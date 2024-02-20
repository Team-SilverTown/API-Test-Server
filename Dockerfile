FROM amazoncorretto:17
LABEL authors="ASak1104"

ARG JAR_FILE=./build/libs/test-api-server.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
