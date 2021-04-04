package com.company.design.strategy;
//전략 메서드를 가진 전략 객체
public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
