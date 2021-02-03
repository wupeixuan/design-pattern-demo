package com.wupx.strategy.model;

import com.wupx.strategy.constant.LoginType;
import lombok.Data;

/**
 * @author wupx
 * @date 2021/1/29 16:12
 */
@Data
public class LoginRequest {

    private LoginType loginType;

    private Long userId;
}
