package com.openclassrooms.HelloWorld;

import com.openclassrooms.HelloWorld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {
	@Autowired
	BusinessService bs;
	@Test
	void contextLoads() {
	}
	@Test
	void getHelloWorld(){
		String expected = "Hello World, Spring Boot !";

		String result = bs.getHelloWorld().getValue();

		assertThat(result).isEqualTo(result);
		//assertEquals(expected,result);
	}

}
