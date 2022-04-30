package com.dlithe.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SnapGramRegisterResponse {

    // private int userId;
    private String userName;
    private int userAge;
    private String userEmailId;

}
