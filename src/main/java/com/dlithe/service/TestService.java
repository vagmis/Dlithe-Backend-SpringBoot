package com.dlithe.service;

import com.dlithe.dto.InsuranceAgentDetailsResponse;
import com.dlithe.dto.InsuranceUserDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchBankingDetails(String bankName);

    String signUpUser(InsuranceUserDetailsRequest insuranceUserDetailsRequest);

    String insuranceAgent(InsuranceAgentDetailsResponse insuranceAgentDetailsResponse);

    InsuranceAgentDetailsResponse getAgentDetails(int agentId);

    /*InsuranceAgentDetailsRequest getAgentFeedback(int agentId);*/

}

