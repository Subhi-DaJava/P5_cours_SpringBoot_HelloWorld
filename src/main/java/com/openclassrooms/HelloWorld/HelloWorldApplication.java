package com.openclassrooms.HelloWorld;

import com.openclassrooms.HelloWorld.model.HelloWorld;
import com.openclassrooms.HelloWorld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {
	/*
	 C’est grâce à l’IoC container de Spring, l’injection de dépendances. En mettant l’annotation @Autowired sur l’attribut bs,
	 Spring va chercher au sein de son contexte s’il existe un bean de type BusinessService.
	 S’il le trouve, il va alors instancier la classe de ce bean et injecter cette instance dans l’attribut.
	  S’il ne trouve pas de bean de ce type, Spring génère une erreur.*/
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}
}
