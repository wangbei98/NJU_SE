package DesignPatthern.Strategy.DuckProject;

public class BeiJingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("北京鸭");
    }


    @Override
    public void fly() {
        System.out.println("~~北京鸭不会飞");
    }
}
