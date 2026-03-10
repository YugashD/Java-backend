package com.abc;

public class demo2 {
    int a=19;
    static	int b =20;

    void m1() {
        int a =29;
        System.out.println("this is the method"+a);
    }

    public demo2() {
        int a = 10;
        System.out.println("constrctor"+a);
    }

    public static void main(String[] args) {
        demo2 demo = new demo2();
        demo.m1();
        System.out.println(demo.a);
        System.out.println(demo2.b);

    }
}