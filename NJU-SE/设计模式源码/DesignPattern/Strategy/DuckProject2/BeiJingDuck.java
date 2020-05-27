package DesignPatthern.Strategy.DuckProject2;

public class BeiJingDuck extends Duck {
    public BeiJingDuck() {
        flyBehaviour = new BadFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
