package com.cjss.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("rama krishna", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Sahadevaiah", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Nageswar rao", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Mahesh", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Satyanarayana", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Rakesh", "Asst Professor")));
            log.info("Preloading " + repository.save(new Employee("Balakrishna", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("Raja", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("Krishna Rao", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("Abbaiah", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("Prasad", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("sansh", "AssoProfessor")));
            log.info("Preloading " + repository.save(new Employee("Praveen", "AssoProfessor")));
        };

    }
}