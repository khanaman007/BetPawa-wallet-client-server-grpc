# BetPawa-wallet-client-server-grpc -A system developed to mimic e-wallet like oxigen and citrus wallet
This microservice  based architeture has five module or microservices as mentioned below
 1. BitWallet-balance microservice - this service helps in checking balance in user e- BitWallet.
 2. BitWallet-Deposit microservice- This service simulates deposit service and user can deposit fund his account.
 3. BitWallet-Withdraw- microservices - This service helps to withdraw funds.
 4. BitWallt-Server  microservice- This service is kind of proxy service which interactts with other above mentioned services
     for various transactions like Balance, Deposit and Withdrwa.
 5. BitWallet-Client - This is simulates client to proxy server.
 # Ready-to-run-WalletApplication - description
   This folder contains soure code, binary files(.clas) and jar file of module.one can either import this project in his/her eclipse or Intellij
    IDE and run all servce. every speficif module contains ReadMe file which has set of instructions.
    
# build-gradle
   This is full-fledged gradle project. one can import in any IDE and proceed. One can also buld this project using CLI. Here is description of all modules or components.
   build-gradle
             -------bitWallet-balance
             -------bitWallet-deposit
             -------bitWallet-withdraw
             -------bitWallet-client
             -------server
             -------src
                       --main
                            ---resources
                                application.properties
                                ---db
                                    -----migration
                                          V1__init.sql
                    pom.xml
                    build.gradle
                    gradlew
                    gradle.bat
                    settings.gradle
   bitWallet-balance
            
             -------src
                       --main
                            ---resources
                                application.properties
                            ---java
                                  ----com.betPawa.bitWallet
                            ---proto
                                  ----com.betPawa.bitWallet
                                        balance.proto
                                         
                    pom.xml
                    build.gradle
                    Dockerfile
   bitWallet-deposit
            
             -------src
                       --main
                            ---resources
                                application.properties
                            ---java
                                  ----com.betPawa.bitWallet
                            ---proto
                                  ----com.betPawa.bitWallet
                                        deposit.proto
                                         
                    pom.xml
                    build.gradle
                    Dockerfile
   bitWallet-withdraw
            
             -------src
                       --main
                            ---resources
                                application.properties
                            ---java
                                  ----com.betPawa.bitWallet
                            ---proto
                                  ----com.betPawa.bitWallet
                                        withdraw.proto
                                         
                    pom.xml
                    build.gradle
                    Dockerfile 
   server
            
             -------src
                       --main
                            ---resources
                                application.properties
                            ---java
                                  ----com.betPawa.bitWallet
                            ---proto
                                  ----com.betPawa.bitWallet
                                        withdraw.proto
                                        deposit.proto
                                        balance.proto
                                        server.proto
                                         
                    pom.xml
                    build.gradle
                    Dockerfile
                    Dockerfile 
   bitWallet-client
            
             -------src
                       --main
                            ---resources
                                application.properties
                            ---java
                                  ----com.betPawa.bitWallet
                            ---proto
                                  ----com.betPawa.bitWallet
                                        withdraw.proto
                                        deposit.proto
                                        balance.proto
                                        server.proto
                                         
                    pom.xml
                    build.gradle
                    Dockerfile
                    Dockerfile 
                    
  # Step to build and run all service 
     1. go to parent project which is #build-gradle, 
        a. run grade clean install -x test ---- gradke command to build all modules
        b. once buld is successful ,  run command gradle flywayMigrate -- to create schema and related tables
     2. move to bitWallet-balance module and build Docker image for balance service.
        1. docker build -t balance:v0.1 .
        2. docker run -p 9090:9090 balance:v0.1
    3. move to bitWallet-withdraw module and build Docker image for withdraw service.
        1. docker build -t withdraw:v0.1 .
        2. docker run -p 1101:1101 withdraw:v0.1
    4. move to bitWallet-deposit module and build Docker image for deposit service.
        1. docker build -t deposit:v0.1 .
        2. docker run -p 1010:1010 deposit:v0.1
    5. move to server module and build Docker image for proxy server service.
        1. docker build -t deposit:v0.1 .
        2. docker run -p 8080:8080 deposit:v0.1
    5. move to bitWallet-client module and build Docker image for clinet  service.
        1. docker build -t cleint:v0.1 .
        2. docker run -p 8081:8081 cleint:v0.1
     
 # Note
   Every module has its owner Dockerfie , please use this file to change port or other configurtion.
