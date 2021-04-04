package com.company.design.strategy;
//전략 객체를 사용하는 컨텍스트
public class Encoder {

    private EncodingStrategy encodingStrategy;

    public String getMessage(String message){
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
