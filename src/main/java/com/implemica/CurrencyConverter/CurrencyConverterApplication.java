package com.implemica.CurrencyConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class CurrencyConverterApplication {

   public static void main(String[] args) {
      ApiContextInitializer.init();

      SpringApplication.run(CurrencyConverterApplication.class, args);
   }

}

