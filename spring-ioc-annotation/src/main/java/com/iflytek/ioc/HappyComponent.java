package com.iflytek.ioc;


public class HappyComponent {
    public void happy() {
        System.out.println("happy");
    }
    public void HappyComponent() {
        System.out.println("HappyComponent");
    }
    public void initMethod() {
        System.out.println("initMethod");

    }
    public void destroyMethod() {
        System.out.println("destroyMethod");
    }
}
