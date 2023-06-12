package com.dagy.cleanarchi.delivery.delivery.application.customer.usecase;

import com.dagy.cleanarchi.delivery.delivery.application.customer.command.Command;
import com.dagy.cleanarchi.delivery.delivery.application.customer.command.OutputHandler;
import com.dagy.cleanarchi.delivery.delivery.application.customer.command.RegisterCustomerCommand;

public interface CreateCustomerUseCase {
    void execute(RegisterCustomerCommand command, OutputHandler handler);

}
