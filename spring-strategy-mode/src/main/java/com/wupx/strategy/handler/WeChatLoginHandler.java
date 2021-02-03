package com.wupx.strategy.handler;

import com.wupx.strategy.constant.LoginType;
import com.wupx.strategy.model.LoginRequest;
import com.wupx.strategy.model.LoginResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wupx
 * @date 2021/1/29 16:16
 */
@Component
public class WeChatLoginHandler implements LoginHandler<String> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取登录类型
     *
     * @return
     */
    @Override
    public LoginType getLoginType() {
        return LoginType.WE_CHAT;
    }

    /**
     * 登录
     *
     * @param request
     * @return
     */
    @Override
    public LoginResponse<String, String> handleLogin(LoginRequest request) {
        logger.info("微信登录：userId：{}", request.getUserId());
        String weChatName = getWeChatName(request);
        return LoginResponse.success("微信登录成功", weChatName);
    }

    private String getWeChatName(LoginRequest request) {
        return "wupx";
    }
}