package com.jb.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.*;
import org.springframework.scheduling.annotation.*;
import springfox.documentation.swagger2.annotations.*;

@EnableScheduling
@SpringBootApplication
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);

		System.out.println("Currency Exchange is up and running..");

	}

}
