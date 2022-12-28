package org.poc;

import org.poc.entity.ErrorMsg;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	public ErrorMsg errorMsg() {
		ErrorMsg errorMsg = new ErrorMsg();
		errorMsg.message = "Internal Error";
		errorMsg.status = "500";
		errorMsg.time="2022-06-18";
		return errorMsg;
	}
}
