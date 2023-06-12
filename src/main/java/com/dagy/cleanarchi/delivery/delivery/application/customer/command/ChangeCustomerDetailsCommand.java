package com.dagy.cleanarchi.delivery.delivery.application.customer.command;

import com.dagy.cleanarchi.delivery.delivery.domain.customer.*;

import java.time.Instant;
import java.time.LocalDate;

public record  ChangeCustomerDetailsCommand(
        CommandId id,
        Instant registeredAt,
        CustomerId customerId,
        FullName fullName,
        LocalDate birthDate,
        Gender gender,
        Address address,
        EmailAddress email
) implements Command {
    public static class Builder {
        private CustomerId customerId;
        private FullName fullName;
        private LocalDate birthDate;
        private Gender gender;
        private Address address;
        private EmailAddress email;

        public Builder customerId(final CustomerId customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder fullName(final FullName fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder birthDate(final LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder gender(final Gender gender) {
            this.gender = gender;
            return this;
        }


        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Builder email(final EmailAddress email) {
            this.email = email;
            return this;
        }

        public ChangeCustomerDetailsCommand assemble() {
            return new ChangeCustomerDetailsCommand(
                    CommandId.generate(),
                    Command.now(),
                    customerId,
                    fullName,
                    birthDate,
                    gender,
                    address,
                    email
            );
        }
    }
}
