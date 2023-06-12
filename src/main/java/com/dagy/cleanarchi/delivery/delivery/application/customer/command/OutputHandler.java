package com.dagy.cleanarchi.delivery.delivery.application.customer.command;

public interface OutputHandler {

        void handle(Output output);

        void handleRegisteredCustomer(RegisterCustomerCommand input);

}
