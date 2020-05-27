package DesignPatthern.Strategy.DuckProject2;

public class BadFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("飞的很垃圾");
    }
}
