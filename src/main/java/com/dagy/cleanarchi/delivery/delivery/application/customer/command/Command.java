package com.dagy.cleanarchi.delivery.delivery.application.customer.command;

import java.time.Instant;

/**
 * Base interface for commands.
 *
 * @author Mate Karolyi
 */
public interface Command {

    /**
     * Obtains the current instant from the system clock.
     *
     * @return {@link Instant}
     */
    static Instant now() {
        return Instant.now();
    }

    /**
     * Retrieves the id of command
     *
     * @return a {@link CommandId}
     */
    CommandId id();

}
