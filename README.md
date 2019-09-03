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
    
  #build-gradle
