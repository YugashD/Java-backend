package com.abc;

public class demo1 {

    public demo1(int a) {
        System.out.println("constrctor");
    }

    void m1(int x) {
        System.out.println("sdfsdf");
    }

    public static void main(String[] args) {
        demo1 demo = new demo1(3);
        demo.m1(3);

    }
}