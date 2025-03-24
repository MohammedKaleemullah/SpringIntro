package com.KaleemStudiesSpring.SpringIntro;

import com.KaleemStudiesSpring.SpringIntro.model.Alien;
import com.KaleemStudiesSpring.SpringIntro.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(SpringIntroApplication.class, args);
		Alien a = c.getBean(Alien.class);
		a.sayHello();
	}
}
