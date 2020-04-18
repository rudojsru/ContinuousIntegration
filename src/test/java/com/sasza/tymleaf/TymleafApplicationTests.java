package com.sasza.tymleaf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TymleafApplicationTests {

	private CarController carController;
	@Test
	void contextLoads() {
		for(Car car: carController.getCars()){
			Assert.hasText("5",car.getMark());

		}
	}

}
