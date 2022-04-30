package com.dlithe.service;


import com.dlithe.dto.SnapGramRegisterResponse;
import org.springframework.stereotype.Component;


@Component
public interface SnapGramService {

     String accountNewRegistration(SnapGramRegisterResponse snapGramRegisterResponse);

     SnapGramRegisterResponse fetchUserDetails(int userId);

}
