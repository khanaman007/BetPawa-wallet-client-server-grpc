package com.betPawa.bitWallet.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@PropertySource("classpath:/application.properties")

public class SpringGrpcApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringGrpcApplication.class, args);
  }
}
