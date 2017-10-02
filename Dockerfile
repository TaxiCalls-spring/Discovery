FROM java:8

MAINTAINER rmeloca@gmail.com

WORKDIR /app

ADD ./target/Discovery.jar /app/

EXPOSE 8761

CMD ["java", "-Xmx200m", "-jar", "/app/Discovery.jar"]