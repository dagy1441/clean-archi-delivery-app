package com.dagy.cleanarchi.delivery.delivery.application.customer.command;

import com.dagy.cleanarchi.delivery.delivery.domain.customer.*;

import java.time.Instant;
import java.time.LocalDate;

public record RegisterCustomerCommand (
        CommandId id,
        CustomerId customerId,
        Instant registeredAt,
        FullName fullName,
        LocalDate birthDate,
        Gender gender,
        Address address,
        EmailAddress emailAddress) implements Command {

    /**
     * Issues a {@link RegisterCustomerCommand} command.
     *
     * @param fullName
     * @param birthDate
     * @param gender
     * @param address
     * @param emailAddress
     * @return an instance of {@link RegisterCustomerCommand} command
     */
    public static RegisterCustomerCommand issue(
            final FullName fullName,
            final LocalDate birthDate,
            final Gender gender,
            final Address address,
            final EmailAddress emailAddress) {

        return new RegisterCustomerCommand (
                CommandId.generate(),
                CustomerId.generate(),
                Command.now(),
                fullName,
                birthDate,
                gender,
                address,
                emailAddress
        );
    }
}
