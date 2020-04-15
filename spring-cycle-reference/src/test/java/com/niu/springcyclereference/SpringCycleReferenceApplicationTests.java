package com.niu.springcyclereference;

import com.niu.springcyclereference.service.HuangService;
import com.niu.springcyclereference.service.NiuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SpringCycleReferenceApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private NiuService niuService;

	@Test
	void contextLoads() {

		niuService.hello();
		niuService.getHuangService().hello();
	}

	@Test
	public void getBean() {

		context.getBean(NiuService.class);
		context.getBean(HuangService.class);
	}

}
