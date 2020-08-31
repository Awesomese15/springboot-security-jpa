package io.thomas.springsecurityjpaandjdbc;

import io.thomas.springsecurityjpaandjdbc.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaAndJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaAndJdbcApplication.class, args);
	}

}
