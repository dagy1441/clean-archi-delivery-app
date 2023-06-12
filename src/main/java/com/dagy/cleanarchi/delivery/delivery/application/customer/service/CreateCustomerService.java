package com.dagy.cleanarchi.delivery.delivery.application.customer.service;

import com.dagy.cleanarchi.delivery.delivery.application.customer.command.Command;
import com.dagy.cleanarchi.delivery.delivery.application.customer.command.Output;
import com.dagy.cleanarchi.delivery.delivery.application.customer.command.OutputHandler;
import com.dagy.cleanarchi.delivery.delivery.application.customer.command.RegisterCustomerCommand;
import com.dagy.cleanarchi.delivery.delivery.application.customer.repository.CustomerRepository;
import com.dagy.cleanarchi.delivery.delivery.application.customer.usecase.CreateCustomerUseCase;
import com.dagy.cleanarchi.delivery.delivery.domain.customer.*;

import java.time.LocalDate;
import java.util.Optional;

public class CreateCustomerService implements CreateCustomerUseCase {
    private final CustomerRepository customerRepository;

    public CreateCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void execute(RegisterCustomerCommand command, OutputHandler handler) {
        final Optional<Customer> customer = customerRepository.findBy(command.customerId());

        if (customer.isPresent()) {
            handler.handleRegisteredCustomer( new RegisterCustomerCommand(
                    command.id(),
                    command.customerId(),
                    command.registeredAt(),
                    command.fullName(),
                    command.birthDate(),
                    command.gender(),
                    command.address(),
                    command.emailAddress()));
            return;
        }

        final Customer savedCustomer = customerRepository.save(new Customer() {
            @Override
            public FullName fullName() {
                return customer.get().fullName();
            }

            @Override
            public LocalDate birthDate() {
                return customer.get().birthDate();
            }

            @Override
            public Gender gender() {
                return customer.get().gender();
            }

            @Override
            public Address address() {
                return customer.get().address();
            }

            @Override
            public EmailAddress emailAddress() {
                return customer.get().emailAddress();
            }
        });

        final Output output = buildOutput(savedCustomer);
        handler.handle(output);
        
    }

    private Output buildOutput(Customer customer) {
        return new Output.Builder()
                .fullName(customer.fullName())
                .birthDate(customer.birthDate())
                .gender(customer.gender())
                .address(customer.address())
                .address(customer.address())
                .email(customer.emailAddress())
                .build();

    }
}
