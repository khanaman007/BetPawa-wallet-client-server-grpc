FROM  openjdk:8
ADD build/libs/bitWallet-balance-0.0.1-SNAPSHOT.jar balance.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "balance.jar"]