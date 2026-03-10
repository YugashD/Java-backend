package com.abc;

public class demo4 {

    public void m1() {
        System.out.println("method");
    }
    public void m1(int a) {
        System.out.println("method with int parameter: "+a);
    }
    public static void main(String[] args) {
        demo4 d=new demo4();
        d.m1();
        d.m1(10);
    }
}
