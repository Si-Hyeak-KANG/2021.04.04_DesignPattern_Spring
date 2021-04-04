package com.company.design.observer;

public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addListenter(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
