package com.wupx.strategy.service;

import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;

import java.io.Serializable;

/**
 * @author wupx
 * @date 2021/1/29 16:38
 */
public interface LoginService {

    /**
     * 登录
     *
     * @param request
     * @return
     */
    LoginResponse<String, Serializable> login(LoginRequest request);
}