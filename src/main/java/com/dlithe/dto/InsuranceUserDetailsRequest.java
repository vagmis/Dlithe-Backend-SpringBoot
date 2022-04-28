package com.dlithe.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class InsuranceUserDetailsRequest {

    private String firstName;
    private String secondName;
    private String mobileNumber;
    private String email;
}
