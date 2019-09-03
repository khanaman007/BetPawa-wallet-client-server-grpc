FROM  openjdk:8
ADD build/libs/bitWallet-client-0.0.1-SNAPSHOT.jar client.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "client.jar"]