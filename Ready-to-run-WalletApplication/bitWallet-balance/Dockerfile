FROM  openjdk:8
ADD target/bitWallet-balance-0.0.1-SNAPSHOT.jar balance.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "balance.jar"]