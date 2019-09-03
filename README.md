# BetPawa-wallet-client-server-grpc -A system developed to mimic e-wallet like oxigen and citrus wallet
This microservice  based architeture has five module or microservices as mentioned below
 1. BitWallet-balance microservice - this service helps in checking balance in user e- BitWallet.
 2. BitWallet-Deposit microservice- This service simulates deposit service and user can deposit fund his account.
 3. BitWallet-Withdraw- microservices - This service helps to withdraw funds.
 4. BitWallt-Server  microservice- This service is kind of proxy service which interactts with other above mentioned services
     for various transactions like Balance, Deposit and Withdrwa.
 5. BitWallet-Client - This simulates client to proxy server.
 # Salient Feature
  1. # Client server
       Motivated with client-server styled  architecture,this system is developed and implemented on Grpc which follows http2.0  protocol.
  2. # Server side Streaming.
  3. # Microservice Archietcture- CRUD Atomicity is acheived by designing atomic service 
       a) create operation - Deposit microsce.
       b) Retrieval operation- Balance Microservice.
       c) Update operation - Withdraw service.
  4. # DB Schema- 
         Use of Flyway plug-n with gradle or maven makes DB migration very handy.
  5. # Stub to Stub Communication.
  6. # Load - 
        it support cleint mult-thredaing and concurrency. you can configure number of threads per client depending on available                 cores at your plateform.
  7. # Round-
         Round demarks boundaries for transaction. one can configure number of rounds per request.
  8. # GRPC stub pooling -
        this system exploit roustness of # managed channel for GRPC stub pooling.
  
 # Ready-to-run-WalletApplication - description
   This folder contains soure code, binary files(.clas) and jar file of module.one can either import this project in his/her eclipse or Intellij
    IDE and run all servce. every speficif module contains ReadMe file which has set of instructions.
     # DB Details 
       Bit Wallet Application has got two tables 
        1. #bit_wallet_account
            This tables is to store the user-baance per currency. for a given user there will as many rows as currencies supported by                the system  i.e one row per currency. At present system supports USD, GBP and EURO only.
        2. bit_wallet_account_transaction
           This trasactional table and contails details of each transaction user makes. This is for audit kind of activities.
    
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
        2. docker run -p 8081:8081 cleint:v0.1 --concurrent.users=10 \ --concurrent.threads.per.user=64 \ --rounds.per.thread=16
     
 # Note
   Every module has its owner Dockerfie , please use this file to change port or other configurtion.
