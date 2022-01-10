package com.projetos.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
//	@Bean                                                                 --> Método utilizado para rodar alguma coisa já na inicializaçao do Spring
//	CommandLineRunner onInitDB(CourseRepository repository) {
//		return args -> {
//			
//			Course course = new Course();
//			course.setName("Java Avançado");
//			course.setCategory("Back-End");
//			repository.save(course);
//			
//			Course course2 = new Course();
//			course2.setName("Angular Avançado");
//			course2.setCategory("Front-End");
//			repository.save(course2);
//			
//		};
//	}

}
