package com.openclassrooms.HelloWorld.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/*
* soit créer une nouvelle classe qui implémente CommandLineRunner, la méthode run (même corps de méthode),
*  et qui aura une annotation @Component (au-dessus du nom de la classe).*/
@Component
public class HelloSprintBoot implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Voici un autre exemple pour implémentation de la classe CommandLineRunner");
    }
}
