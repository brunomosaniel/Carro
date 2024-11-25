package io.github.brunomosaniel.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);

		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.run(args);
		builder.profiles("producao");
		builder.bannerMode(Banner.Mode.OFF);
	}

}
