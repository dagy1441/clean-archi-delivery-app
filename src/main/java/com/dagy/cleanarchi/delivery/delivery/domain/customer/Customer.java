package com.dagy.cleanarchi.delivery.delivery.domain.customer;

import java.time.LocalDate;

public interface Customer {
     FullName fullName();
     LocalDate birthDate();
     Gender gender();
     Address address();
     EmailAddress emailAddress();
}
