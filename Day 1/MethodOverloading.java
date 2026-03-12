package com.abc;

public class MethodOverloading {

    public void m1() {
        System.out.println("method");
    }
    public void m1(int a) {
        System.out.println("method with int parameter: "+a);
    }
    public static void main(String[] args) {
        MethodOverloading d=new MethodOverloading();
        d.m1();
        d.m1(10);
    }
}
