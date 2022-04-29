package com.dlithe.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class InsuranceAgentDetailsRequest {

        private  String name;
        private String location;
        /* add that DTO here to get */
        private List<FeedbackResponse> feedbackResponse;
}
