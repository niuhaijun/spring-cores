package com.niu.springcyclereference;

import com.niu.springcyclereference.service.NiuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringCycleReferenceApplicationTests {

	@Autowired
	private NiuService niuService;

	@Test
	void contextLoads() {

		niuService.hello();
		niuService.getHuangService().hello();
	}

}
