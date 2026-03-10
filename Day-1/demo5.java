package com.abc;
class family{
    void property(){
        System.out.println("Gets property");
    }
    void marry(){
        System.out.println("Family girl, family property");
    }
}
public class demo5 extends family{
    void marry() {
        System.out.println("Campus girl, no family property");
    }
    public static void main(String[] args) {
        demo5 d=new demo5();
        d.marry();
        d.property();
    }

}
