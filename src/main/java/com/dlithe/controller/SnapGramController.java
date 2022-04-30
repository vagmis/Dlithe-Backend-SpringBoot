package com.dlithe.controller;

import com.dlithe.dto.SnapGramRegisterResponse;
import com.dlithe.entity.SnapGramUserLogin;
import com.dlithe.service.SnapGramService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
public class SnapGramController {

    @Autowired
    private SnapGramService snapGramService;

    @PostMapping("get-account-login")
        public String accountRegistration(@RequestBody SnapGramRegisterResponse snapGramRegisterResponse){
            return snapGramService.accountNewRegistration(snapGramRegisterResponse);

    }

    @GetMapping("get-user-details/{userId}")
        public SnapGramRegisterResponse fetchUserDetails(@PathVariable int userId){
        return snapGramService.fetchUserDetails(userId);
    }

}
