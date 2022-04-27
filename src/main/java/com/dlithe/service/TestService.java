package com.dlithe.service;

import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchBankingDetails(String bankName);
}
