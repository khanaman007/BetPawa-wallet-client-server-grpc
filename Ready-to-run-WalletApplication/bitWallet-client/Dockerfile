FROM  openjdk:8
ADD target/bitWallet-client-0.0.1-SNAPSHOT.jar client.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "client.jar"]