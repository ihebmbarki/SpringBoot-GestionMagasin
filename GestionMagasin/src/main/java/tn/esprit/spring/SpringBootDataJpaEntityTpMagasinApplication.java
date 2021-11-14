package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import tn.esprit.spring.control.ClientRestController;

@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("tn.esprit.spring")
public class SpringBootDataJpaEntityTpMagasinApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaEntityTpMagasinApplication.class, args);
	}

}
