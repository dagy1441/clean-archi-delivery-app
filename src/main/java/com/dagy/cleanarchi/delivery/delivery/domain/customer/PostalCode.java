package com.dagy.cleanarchi.delivery.delivery.domain.customer;

public record PostalCode(Integer value) {

    /**
     * Default constructor
     *
     * @param value
     */
    public PostalCode {
        if (value == null) throw new IllegalArgumentException("PostalCode cannot be null!");
    }

    /**
     * Create an instance of {@link PostalCode} based on the given parameter
     *
     * @param value postal code as integer
     * @return an instance of {@link PostalCode}
     */
    public static PostalCode from(final Integer value) {
        return new PostalCode(value);
    }

}
