package hello;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            String plainTextPassword = "123";
            BCryptPasswordEncoder bc = new BCryptPasswordEncoder();

            System.out.println("PRINT ENCODED PASSWORD  FOR : "+plainTextPassword);

            System.out.println(" ");
            System.out.println(" ENCODED PASSWORD  BELOW :  ");
            System.out.println(bc.encode(plainTextPassword));

        };
    }

}

