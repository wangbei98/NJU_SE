package DesignPatthern.Strategy.DuckProject2;

public class GoodFlyBehaviour implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("非常能飞");
    }
}
