FROM openjdk:17

COPY target/Book-RestAPI.jar /usr/app/Book-RestAPI.jar

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","Book-RestAPI.jar" ]

EXPOSE 8080