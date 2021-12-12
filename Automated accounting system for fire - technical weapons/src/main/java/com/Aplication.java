package com;


import java.util.Scanner;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Aplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(StudentRepository studentRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Scanner scanner = new Scanner(System.in);


            }

        };

    }

}
