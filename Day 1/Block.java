package com.abc;

public class Block {

    {
        System.out.println("Heello block");
    }

    static {
        System.out.println("static Heello block");
    }

    public Block(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Block demo = new Block();

    }
}
