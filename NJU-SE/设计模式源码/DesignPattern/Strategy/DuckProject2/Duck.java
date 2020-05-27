package DesignPatthern.Strategy.DuckProject2;

public abstract class Duck {
    FlyBehaviour flyBehaviour;

    public abstract void display();

    public void quack(){
        System.out.println("鸭子会叫");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
        flyBehaviour.fly();
    }
}
