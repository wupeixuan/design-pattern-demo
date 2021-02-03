package com.wupx.strategy.handler;

import com.wupx.strategy.constant.LoginType;
import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;

import java.io.Serializable;

/**
 * 登录处理器接口
 *
 * @author wupx
 * @date 2021/1/29 16:01
 */
public interface LoginHandler<T extends Serializable> {

    /**
     * 获取登录类型
     *
     * @return
     */
    LoginType getLoginType();

    /**
     * 登录
     *
     * @param request
     * @return
     */
    LoginResponse<String, T> handleLogin(LoginRequest request);
}
