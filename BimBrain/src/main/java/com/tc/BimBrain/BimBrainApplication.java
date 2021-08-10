package com.tc.BimBrain;

import org.kie.api.KieServices;
import org.kie.api.internal.utils.KieService;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BimBrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(BimBrainApplication.class, args);
	}

	@Bean
	public KieContainer kieContainer(){
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
