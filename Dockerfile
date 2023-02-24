FROM openjdk:17-jdk-alpine
RUN addgroup -S piuser && adduser -S piuser -G piuser
USER piuser

ENV JAVA_OPTS=""
ARG JAR_FILE=build/libs/investment-web-discovery-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["sh" , "-c" , "java $JAVA_OPTS -jar /app.jar"]