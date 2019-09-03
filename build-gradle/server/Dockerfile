FROM  openjdk:8
ADD build/libs/bitWallet-server-0.0.1-SNAPSHOT.jar proxyserver.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "proxyserver.jar"]