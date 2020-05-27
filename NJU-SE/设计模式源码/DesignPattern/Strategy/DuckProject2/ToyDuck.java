package DesignPatthern.Strategy.DuckProject2;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehaviour = new NoFlyBehaviour();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
