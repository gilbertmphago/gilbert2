package org.example;

import org.example.model.employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
@Autowired
private EmployeeRepository employeeRepository;
@Override

    public void run(String... args) throws Exception {
        employee Employee = new employee();
        Employee.setFirstName("gilbert");
        Employee.setLastName("mphago");
        Employee.setEmailId("gilbertmphago@gmail.com");
        employeeRepository.save(Employee);

    employee Employee1 = new employee();
    Employee1.setFirstName("chuene");
    Employee1.setLastName("mashaba");
    Employee1.setEmailId("chuenemashaba@gmail.com");
    employeeRepository.save(Employee1);
    }
}