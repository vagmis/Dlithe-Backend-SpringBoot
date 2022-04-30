package com.dlithe.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class FeedbackResponseList {
    private String feedbackName;
    private String feedback;
    private String rating;

}
