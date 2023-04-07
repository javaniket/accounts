FROM eclipse-temurin:17

MAINTAINER springboot.com

COPY target/Accounts-0.0.1-SNAPSHOT.jar Accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","Accounts-0.0.1-SNAPSHOT.jar"]