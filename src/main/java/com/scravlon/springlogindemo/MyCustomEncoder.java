package com.scravlon.springlogindemo;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyCustomEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence+"asd";
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.equals(s);
    }
}
