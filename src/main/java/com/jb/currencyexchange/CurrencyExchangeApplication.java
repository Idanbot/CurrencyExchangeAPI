package com.jb.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.*;

@SpringBootApplication
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);

		System.out.println("Currency Exchange is up and running..");

		// TODO add cache
		// TODO daily job to clear cache
		// TODO logger?

		// TODO read:
		//	https://viridian-lightyear-075.notion.site/Spring-Web-72f2029c757e473496fc8bdaad4df8e9
		//	https://viridian-lightyear-075.notion.site/Coupon-System-Phase-2-Supports-95601c0e9b8348279ea9dd6bf421f8b5
		//	https://viridian-lightyear-075.notion.site/Todo-Application-b753d632b85841149526b8d2e733d540
		//	https://gainjavaknowledge.medium.com/spring-boot-aop-example-591c10e62e96
	}

}
