package com.dagy.cleanarchi.delivery.delivery.application.customer.command;

import java.util.UUID;

public record CommandId(UUID id) {
    /**
     * Default constructor
     *
     * @param id {@link UUID} unique identifier of command
     */
    public CommandId {
        if (id == null) throw new IllegalArgumentException("CommandId cannot be null!");
    }

    /**
     * Create an instance of {@link CommandId}
     *
     * @param value {@link String} raw string value of a UUID type
     * @return an instance of {@link CommandId} type
     */
    public static CommandId from(final String value) {
        return new CommandId(UUID.fromString(value));
    }

    /**
     * Generates an unique {@link CommandId} command id.
     *
     * @return an instance of {@link CommandId} type
     */
    public static CommandId generate() {
        return new CommandId(UUID.randomUUID());
    }
}
