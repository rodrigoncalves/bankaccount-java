FROM java:8
LABEL maintainer="rodrigosg2000@gmail.com"
VOLUME /tmp
EXPOSE 8080
ADD target/bankaccount-0.0.1-SNAPSHOT.jar bankaccount-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","bankaccount-0.0.1-SNAPSHOT.jar"]