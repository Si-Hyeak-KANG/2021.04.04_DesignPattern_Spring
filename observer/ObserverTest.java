package com.company.design.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Button button = new Button("버튼");

        button.addListenter(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });//이벤트를 전달

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");
    }
}
