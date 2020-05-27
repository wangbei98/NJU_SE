package DesignPatthern.Strategy.DuckProject2;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
