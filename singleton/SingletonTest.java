package com.company.design.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        //singleton
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        // 어떠한 프로그램에서 단 하나의 객체만 존재해야 한다면 SINGLETON 패턴을 이용 한다
    }
}
