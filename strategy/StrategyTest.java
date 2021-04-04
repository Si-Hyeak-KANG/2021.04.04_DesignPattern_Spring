package com.company.design.strategy;
//전략 객체를 생성해 컨텍스트에 주입하는 클라이언트
public class StrategyTest {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();//Encoder 객체 자체는 변화x

        //base64 전략
        EncodingStrategy base64 = new Base64Strategy();

        //normal 전략
        EncodingStrategy normal = new NormalStrategy();

        String message ="hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);//aGVsbG8gamF2YQ==

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);//hello java
        //append
        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);//ABCDhello java

    }
}
