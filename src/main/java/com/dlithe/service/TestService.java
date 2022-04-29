package com.dlithe.service;

import com.dlithe.dto.InsuranceAgentDetailsRequest;
import com.dlithe.dto.InsuranceUserDetailsRequest;
import com.dlithe.entity.Agent;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface TestService {

    String fetchBankingDetails(String bankName);

    String signUpUser(InsuranceUserDetailsRequest insuranceUserDetailsRequest);

    String insuranceAgent(InsuranceAgentDetailsRequest insuranceAgentDetailsRequest);

    InsuranceAgentDetailsRequest getAgentDetails(int agentId);
}

