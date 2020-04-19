package com.scravlon.springlogindemo;

import com.scravlon.springlogindemo.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringLoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoginDemoApplication.class, args);
	}

}
