package com.omt.common.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by wangbl on 16/8/24.
 */
//此处是为了不做密码校验,继承了父类,替换了原有方法.直接返回true
public class ExtendBCryptPasswordEncoder extends BCryptPasswordEncoder {
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return true;
    }
}
