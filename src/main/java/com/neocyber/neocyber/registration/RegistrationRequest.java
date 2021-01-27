package com.neocyber.neocyber.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String first_name;
    private final String last_name;
    private final String address;
    private final Integer zip_code;
    private final String mobile_number;
    private final String email;
    private final String password;
}
