/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.poc;

import org.poc.config.Config;
import org.poc.entity.ErrorMsg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AppTestDemo {
	@Test
	void testAnnotationConfigApplicationContext() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ErrorMsg.class);
		ctx.close();
		Assertions.assertNotNull(ctx);
	}

	@Test
	void test_scan() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ErrorMsg msg = ctx.getBean(ErrorMsg.class);
		Assertions.assertNotNull(msg);
	}
}
