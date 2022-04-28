package com.dlithe.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class InsuranceAgentDetailsRequest {

        private String name;
        private String location;
}
