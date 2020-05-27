package DesignPatthern.Strategy.DuckProject;

public class WaterDuck extends Duck{
    @Override
    public void display() {
        System.out.println("水鸭");
    }

    @Override
    public void fly() {
        System.out.println("~~水鸭不会飞");
    }
}
