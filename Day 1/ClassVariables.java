package com.abc;

public class ClassVariables {
    int a=19;
    static	int b =20;

    void m1() {
        int a =29;
        System.out.println("this is the method"+a);
    }

    public ClassVariables() {
        int a = 10;
        System.out.println("constrctor"+a);
    }

    public static void main(String[] args) {
        ClassVariables demo = new ClassVariables();
        demo.m1();
        System.out.println(demo.a);
        System.out.println(ClassVariables.b);

    }
}