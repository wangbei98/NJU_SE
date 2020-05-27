package DesignPatthern.Factory.AbstractFactory.Order;

public class PizzaStore {
    public static void main(String[] args) {
        new PizzaOrder(new BJFactory());
    }
}
