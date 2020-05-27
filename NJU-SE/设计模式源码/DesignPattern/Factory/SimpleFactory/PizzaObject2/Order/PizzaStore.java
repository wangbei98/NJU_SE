package DesignPatthern.Factory.SimpleFactory.PizzaObject2.Order;

public class PizzaStore {
    public static void main(String[] args) {
        new PizzaOrder(new SimpleFactory());
    }
}
