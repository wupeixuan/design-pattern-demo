package com.wupx.strategy.handler;

import com.wupx.strategy.constant.LoginType;
import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author wupx
 * @date 2021/1/29 16:16
 */
@Component
public class WeiBoLoginHandler implements LoginHandler<Serializable> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取登录类型
     *
     * @return
     */
    @Override
    public LoginType getLoginType() {
        return LoginType.WEI_BO;
    }

    /**
     * 登录
     *
     * @param request
     * @return
     */
    @Override
    public LoginResponse<String, Serializable> handleLogin(LoginRequest request) {
        logger.info("微博登录：userId：{}", request.getUserId());
        return LoginResponse.success("微博登录成功", null);
    }
}
