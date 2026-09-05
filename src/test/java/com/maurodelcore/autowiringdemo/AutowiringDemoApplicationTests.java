package com.maurodelcore.autowiringdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * Now let's run it. Go to your main class — AutowiringDemoApplication.
 * You need to get the NotificationService from Spring and call notify.

 You did this in ContextDemo with getBean(). Same idea here — get the ApplicationContext from SpringApplication.run(), pull out NotificationService, and call notify with any message. Give it a try.*/
@SpringBootTest
class AutowiringDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
