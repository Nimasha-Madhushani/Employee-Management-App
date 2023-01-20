package com.example.SpringRecap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public void SpringRecapApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest newCustomerRequest) {
        Customer customer = new Customer();
        customer.setAge(newCustomerRequest.age());
        customer.setName(newCustomerRequest.name());
        customer.setEmail(newCustomerRequest.email());
        customerRepository.save(customer);
    }

    // Helper classes

    record NewCustomerRequest(String name, String email, Integer age) { }

}