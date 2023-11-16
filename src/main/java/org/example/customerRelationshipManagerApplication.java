package org.example;

import org.example.service.crmService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class customerRelationshipManagerApplication {

    public static void main(String[] args) {
        //Class that is being tested to run
        SpringApplication.run(customerRelationshipManagerApplication.class, args);

        //Test for Service class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        crmService myCrmService = context.getBean(crmService.class);


        int factorialOf5= myCrmService.factorial(5);
        System.out.println("Factorial of 5 is "+ factorialOf5);

        context.close();
    }

//    @GetMapping("/hello")
//    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }

}