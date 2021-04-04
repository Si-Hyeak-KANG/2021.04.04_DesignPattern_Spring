package com.company.design.strategy;
//전략 메서드를 가진 전략 객체
import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
