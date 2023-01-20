package com.example.SpringRecap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@SpringBootApplication
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//
//@EnableWebMvc
//@RequestMapping(name = "api/v1/customers" ,method = RequestMethod.POST)
//@ComponentScan(basePackages = "com.example.SpringRecap")
//@EnableAutoConfiguration
//@Configuration

public class SpringRecapApplication {
    //dependency injection
//    private static  CustomerRepository customerRepository;

    public SpringRecapApplication(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringRecapApplication.class, args);
    }

//    @GetMapping
//    public List<Customer> getCustomer() {
////        return List.of();
//        return customerRepository.findAll();
//
//    }
//
//    record NewCustomerRequest(
//            String name,
//            String email,
//            Integer age
//    ) {
//        @PostMapping
//        public void addCustomer(@RequestBody NewCustomerRequest newCustomerRequest) {
//            Customer customer = new Customer();
//            customer.setAge(newCustomerRequest.age());
//            customer.setName(newCustomerRequest.name());
//            customer.setEmail(newCustomerRequest.email());
//            customerRepository.save(customer);
//        }
//    }

//
//    @GetMapping("/")
//    public NewEmp employee() {
//        NewEmp response = new NewEmp("Nimasha", List.of("C", "Java"), new Person("Alex", 20, 50000.00));
//        return response;
//    }
//
//    record Person(String name, int age, double savings) {
//    }
//
//    record NewEmp(String Nimasha, List<String> programmingLang, Person person) {
//
////    }
////    class NewEmp {
////        private final String employee;
////
////        //create constructor
////        public NewEmp(String employee) {
////            this.employee = employee;
////        }
////
////        //getter
////        public String getEmployee() {
////            return employee;
////        }
////        //toString
////
////        @Override
////        public String toString() {
////            return "NewEmp{" +
////                    "employee='" + employee + '\'' +
////                    '}';
////        }
//    }


}
