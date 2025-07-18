package baeldung.simple_spring_boot_aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.baeldung.persistence.repo")
@EntityScan("com.baeldung.persistence.model")
@SpringBootApplication
public class SimpleSpringBootAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAplicationApplication.class, args);
	}

}
