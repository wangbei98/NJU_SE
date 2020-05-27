package DesignPatthern.Strategy.DuckProject2;

public class WildDuck extends Duck {
    public WildDuck() {
        flyBehaviour = new GoodFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
