package org.poc.config;

import org.poc.entity.ErrorMsg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.poc.entity")
public class Config {
	@Bean
	public ErrorMsg errorMsg() {
		ErrorMsg errorMsg = new ErrorMsg();
		errorMsg.message = "Internal Error";
		errorMsg.status = "500";
		errorMsg.time="2022-06-18";
		return errorMsg;
	}
}
