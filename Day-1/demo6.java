package com.abc;

class grandparents {
    void sugar() {
        System.out.println("I am having sugar");
    }
}
class parents extends grandparents{
    void BP() {
        System.out.println("I am having BP");
    }
}
public class demo6 extends parents{
    public static void main(String[] args) {
        demo6 d=new demo6();
        d.BP();
        d.sugar();
    }

}
