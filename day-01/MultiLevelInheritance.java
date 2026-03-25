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
public class MultiLevelInheritance extends parents{
    public static void main(String[] args) {
        MultiLevelInheritance d=new MultiLevelInheritance();
        d.BP();
        d.sugar();
    }

}
