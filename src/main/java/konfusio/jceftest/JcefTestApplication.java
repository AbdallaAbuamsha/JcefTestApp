package konfusio.jceftest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JcefTestApplication {

	public static void main(String[] args) {
	 	SpringApplicationBuilder builder = new SpringApplicationBuilder(JcefTestApplication.class);
		builder.headless(false);
		builder.run(args);
	}

}
