package com.abc;
class family{
    void property(){
        System.out.println("Gets property");
    }
    void marry(){
        System.out.println("Family girl, family property");
    }
}
public class MethodOverriding extends family{
    void marry() {
        System.out.println("Campus girl, no family property");
    }
    public static void main(String[] args) {
        MethodOverriding d=new MethodOverriding();
        d.marry();
        d.property();
    }

}
