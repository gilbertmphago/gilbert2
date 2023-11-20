package net.springbootmappingboot;

import controller.usercontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
public static void main(String[] args){

    new SpringApplicationBuilder(usercontroller.class).build().run(args);
}
}