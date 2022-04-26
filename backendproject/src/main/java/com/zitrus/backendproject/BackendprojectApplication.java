package com.zitrus.backendproject;

import com.zitrus.backendproject.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackendprojectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(BackendprojectApplication.class, args);


		UsuarioRepository usuarioRepository =
				configurableApplicationContext.getBean(UsuarioRepository.class);

	}
}
