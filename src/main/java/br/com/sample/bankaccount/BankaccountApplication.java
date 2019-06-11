package br.com.sample.bankaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", "br.com.sample.bankaccount.domain" , "br.com.sample.bankaccount.web.rest", "br.com.sample.bankaccount.config"})
public class BankaccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankaccountApplication.class, args);
	}

}
