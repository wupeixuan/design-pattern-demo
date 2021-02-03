package com.wupx.strategy.model;

import lombok.Data;

/**
 * @author wupx
 * @date 2021/1/29 16:11
 */
@Data
public class LoginResponse<S, T> {

    private S msg;
    private T data;

    private LoginResponse(S msg, T data) {
        super();
        this.msg = msg;
        this.data = data;
    }

    public static <S, T> LoginResponse<S, T> success(S msg, T data) {
        return new LoginResponse<>(msg, data);
    }

}
