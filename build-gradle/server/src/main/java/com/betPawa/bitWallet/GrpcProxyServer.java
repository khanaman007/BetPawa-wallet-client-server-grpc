package com.betPawa.bitWallet;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.grpc.ServerBuilder;
import io.grpc.channelz.v1.Server;

@SpringBootApplication

@PropertySource("classpath:/application.properties")

public class GrpcProxyServer {

//private io.grpc.BindableService service;
  public static void main(String[] args) {
	  SpringApplication.run(GrpcProxyServer.class, args);
  
  }
}
