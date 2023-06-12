package com.dagy.cleanarchi.delivery.delivery.application.customer.query;

import java.time.LocalDate;
import java.util.Optional;

public record FilterCriteria(Optional<LocalDate> birthDateFrom,
                             Optional<LocalDate> birthDateTo) {

}
