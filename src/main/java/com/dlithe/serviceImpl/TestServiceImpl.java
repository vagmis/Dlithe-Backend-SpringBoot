package com.dlithe.serviceImpl;

import com.dlithe.dto.InsuranceUserDetailsRequest;
import com.dlithe.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String fetchBankingDetails(String bankName) {
        if (bankName != null) {

            switch (bankName) {
                case "One":
                    return "Canara Bank";
                case "Two":
                    return "Kotak Bank";
                case "Three":
                    return "ICICI Bank";
                case "Four":
                    return "Union Bank";
                default:
                    return "No Bank Found";
            }
        } else {
            return "null";
        }
    }
        @Override
        public String signUpUser(InsuranceUserDetailsRequest insuranceUserDetailsRequest){
            System.out.println(insuranceUserDetailsRequest);
        return null;
        }
    }



