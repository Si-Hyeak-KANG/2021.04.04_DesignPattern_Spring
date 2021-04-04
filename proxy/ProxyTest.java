package com.company.design.proxy;

import com.company.design.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyTest {

    public static void main(String[] args) {
        //proxy
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        IBrowser Pbrowser = new BrowserProxy("www.naver.com");
        Pbrowser.show();//첫번째만 로딩
        Pbrowser.show();//자신이 가지고 있는 html 캐싱된 결과만 송출 (우리가 아는 그 캐쉬삭제)
        Pbrowser.show();
        Pbrowser.show();

        //aop

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());//총 몇 초 걸렸는지

                }
        );

        aopBrowser.show();
        System.out.println("loading time : "+ end.get());

        aopBrowser.show();
        System.out.println("loading time : "+ end.get());

    }

}
