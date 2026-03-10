package com.abc;

class grandparents1 {
    void sugar() {
        System.out.println("I am having sugar");
    }
}
class parents1 extends grandparents1{
    void BP() {
        System.out.println("I am having BP");
    }
}
public class demo7 extends grandparents1{
    public static void main(String[] args) {
        demo7 d=new demo7();
        d.sugar();
    }

}
