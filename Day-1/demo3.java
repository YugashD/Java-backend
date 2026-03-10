package com.abc;

public class demo3 {

    {
        System.out.println("Heello block");
    }

    static {
        System.out.println("static Heello block");
    }

    public demo3(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        demo3 demo = new demo3();

    }
}
