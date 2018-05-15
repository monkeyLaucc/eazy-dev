package cc.lau.eazydev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EazyDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyDevApplication.class, args);
	}
}
