package Visitors;

public class Visitor {
    private int age;
    private int height;
    private double money;

    public Visitor(int age, int height, double money){
         this.age = age;
         this.height = height;
         this.money = money;
    }

    public int getAge(){
        return this.age;
    }
}
