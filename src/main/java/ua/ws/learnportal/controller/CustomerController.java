package ua.ws.learnportal.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ws.learnportal.domain.Customer;
import ua.ws.learnportal.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> list() {

        List<Customer> list = customerService.getCustomerList();
        System.out.println(list);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
