package com.spring.SpringApplication.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
            Student ketan = new Student(
                                1L,
                                "Ketan",
                                "ketan.shinde@sparkeighteen.com",
                    LocalDate.of(2000, Month.OCTOBER, 6),
                    21
                        );
            Student bhavesh = new Student(
                                "bhavesh",
                                "bhavesh.kadam@sparkeighteen.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 7),
                    21
                        );
            Student hrishi = new Student(
                    "hrishi",
                    "hrishikesh.shegde@sparkeighteen.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 7),
                    21
            );
            repository.saveAll(
                    List.of(ketan, bhavesh, hrishi)
            );
        };
    }

}
