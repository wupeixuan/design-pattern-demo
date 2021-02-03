package com.wupx.strategy.controller;

import com.wupx.strategy.constant.LoginType;
import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;
import com.wupx.strategy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author wupx
 * @date 2021/1/29 16:13
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     */
    @PostMapping("/login")
    public LoginResponse<String, Serializable> login(@RequestParam LoginType loginType, @RequestParam Long userId) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setLoginType(loginType);
        loginRequest.setUserId(userId);
        return loginService.login(loginRequest);
    }
}
