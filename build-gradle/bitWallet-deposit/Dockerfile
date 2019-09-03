FROM  openjdk:8
ADD build/libs/bitWallet-deposit-0.0.1-SNAPSHOT.jar deposit.jar
EXPOSE 1010
ENTRYPOINT ["java", "-jar", "deposit.jar"]