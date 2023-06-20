package com.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinApplicationTests {
	
    private static Logger logger = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case is executing");
		assertEquals(true, true);
	}
}
