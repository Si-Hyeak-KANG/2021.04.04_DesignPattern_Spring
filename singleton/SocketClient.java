package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;//싱글톤은 자기 자신을 객체로 갖고 있어야 함.

    private SocketClient(){

    }//싱글톤은 기본생성자를 private으로 막아야함

    public static SocketClient getInstance() {

        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
