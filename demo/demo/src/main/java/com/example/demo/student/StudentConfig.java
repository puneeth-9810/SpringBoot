package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student puneeth = new Student(
                    LocalDate.of(2005, AUGUST, 10),
                    "puneethgudaru@gmail.com",
                    "Puneeth"
            );

            Student sai = new Student(
                    LocalDate.of(2002, SEPTEMBER, 10),
                    "saigudaru@gmail.com",
                    "Sai"
            );

            repository.saveAll(List.of(puneeth,sai));
        };
    }
}
