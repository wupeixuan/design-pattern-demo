package com.wupx.strategy.service.impl;

import com.wupx.strategy.constant.LoginType;
import com.wupx.strategy.handler.LoginHandler;
import com.wupx.strategy.handler.LoginHandlerFactory;
import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;
import com.wupx.strategy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author wupx
 * @date 2021/1/29 16:44
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginHandlerFactory loginHandlerFactory;

    @Override
    public LoginResponse<String, Serializable> login(LoginRequest request) {
        LoginType loginType = request.getLoginType();
        // 根据 loginType 找到对应的登录处理器
        LoginHandler<Serializable> loginHandler =
                loginHandlerFactory.getHandler(loginType);
        // 处理登录
        return loginHandler.handleLogin(request);
    }
}
