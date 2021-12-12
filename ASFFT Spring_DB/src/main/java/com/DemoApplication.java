package com;

import com.students.Firebarrel;
import com.students.EquipmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	@Bean
	public CommandLineRunner runner(EquipmentRepository equipmentRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Scanner scanner = new Scanner(System.in);

				while (true) {
					System.out.println("Enter device name...");
					String input = scanner.nextLine();
					if (input.equals("0")){
						System.out.println("Programm is closing ... ");
						break;
					}else if(input.equals("sprk8")){
						equipmentRepository.save(new Firebarrel("Sprk8B"));
					}
					else if (input.equals("del")){
						if (equipmentRepository.count() != 0) {
							equipmentRepository.deleteAll();
						}else {
							System.out.println("No delete statement");}
					}
				}
			}

		};

	}

}
