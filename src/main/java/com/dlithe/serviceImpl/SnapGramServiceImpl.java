package com.dlithe.serviceImpl;


import com.dlithe.dto.SnapGramRegisterResponse;
import com.dlithe.entity.SnapGramUserLogin;
import com.dlithe.repository.SnapGramUserLoginDAO;
import com.dlithe.service.SnapGramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SnapGramServiceImpl implements SnapGramService {

    @Autowired
    private SnapGramUserLoginDAO snapGramUserLoginDAO;


    @Override
    public String accountNewRegistration(SnapGramRegisterResponse snapGramRegisterResponse) {
        SnapGramUserLogin snapGramUserLogin = new SnapGramUserLogin();

        snapGramUserLogin.setUserName(snapGramRegisterResponse.getUserName());
        snapGramUserLogin.setUserAge(snapGramRegisterResponse.getUserAge());
        snapGramUserLogin.setUserEmailId(snapGramRegisterResponse.getUserEmailId());

        snapGramUserLoginDAO.save(snapGramUserLogin);
        return "User Agent added Successfully";
    }

    @Override
    public SnapGramRegisterResponse fetchUserDetails(int userId) {
        Optional<SnapGramUserLogin> snapGramUserLogin = snapGramUserLoginDAO.findById(userId);
        SnapGramRegisterResponse snapGramRegisterResponse = new SnapGramRegisterResponse();

        SnapGramUserLogin snapGramUserLogins1 = snapGramUserLogin.get();



        snapGramRegisterResponse.setUserName(snapGramUserLogins1.getUserName());
        snapGramRegisterResponse.setUserAge(snapGramUserLogins1.getUserAge());
        snapGramRegisterResponse.setUserEmailId(snapGramUserLogins1.getUserEmailId());

        return snapGramRegisterResponse;
    }
}
