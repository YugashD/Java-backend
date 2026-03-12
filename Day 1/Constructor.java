package com.abc;

public class Constructor {

    public Constructor(int a) {
        System.out.println("constrctor");
    }

    void m1(int x) {
        System.out.println("sdfsdf");
    }

    public static void main(String[] args) {
        Constructor demo = new Constructor(3);
        demo.m1(3);

    }
}