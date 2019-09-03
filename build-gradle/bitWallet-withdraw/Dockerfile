FROM  openjdk:8
ADD build/libs/bitWallet-withdraw-0.0.1-SNAPSHOT.jar withdraw.jar
EXPOSE 1101
ENTRYPOINT ["java", "-jar", "withdraw.jar"]