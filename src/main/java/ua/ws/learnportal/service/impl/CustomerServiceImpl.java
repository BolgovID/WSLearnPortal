package ua.ws.learnportal.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.ws.learnportal.domain.Customer;
import ua.ws.learnportal.repository.CustomerRepository;
import ua.ws.learnportal.service.CustomerService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }
}
