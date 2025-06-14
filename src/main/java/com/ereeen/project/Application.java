package com.ereeen.project;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static String ApplicationMode = "prod";


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args) {
        if (args.length > 0) {
            if (args[0].equals("dev")) {
                System.out.println("Running in dev mode");
                ApplicationMode = "dev";
            } else if (args[0].equals("prod")) {
                System.out.println("Running in prod mode");
                ApplicationMode = "prod";
            }
        }
    }

    @PreDestroy
    public void exit() {

    }
}
