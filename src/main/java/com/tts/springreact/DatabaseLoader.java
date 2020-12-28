package com.tts.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Jessica", "Smith", "Accountant"));
        this.repository.save(new Employee("Adam", "Jones", "Programmer"));
        this.repository.save(new Employee("David", "Williams", "Project Manager"));
        this.repository.save(new Employee("Sarah", "Adams", "Accountant"));
        this.repository.save(new Employee("Jennifer", "Jones", "Accountant"));
        this.repository.save(new Employee("Mary", "Johnson", "Project Manager"));
        this.repository.save(new Employee("Glen", "Galvan", "Accountant"));
        this.repository.save(new Employee("Bridget", "Willis", "Accountant"));
        this.repository.save(new Employee("Henry", "Sharp", "Accountant"));
        this.repository.save(new Employee("Jaden", "Berg", "Programmer"));
        this.repository.save(new Employee("Kevin", "Bourne", "Customer Relations"));
        this.repository.save(new Employee("Celia", "Berg", "Project Manager"));
        this.repository.save(new Employee("Jon", "Wu", "Accountant"));
        this.repository.save(new Employee("Adelle", "Braun", "Programmer"));
        this.repository.save(new Employee("Kerys", "Chen", "Project Manager"));
        this.repository.save(new Employee("Holly", "Cain", "Accountant"));
        this.repository.save(new Employee("Marcus", "Nelson", "Accountant"));
        this.repository.save(new Employee("Elli", "Nelson", "Project Manager"));
        this.repository.save(new Employee("Aaron", "Carson", "Accountant"));
        this.repository.save(new Employee("Violet", "Abbot", "Customer Relations"));
    }
}
