package DesignPatthern.Factory.SimpleFactory.PizzaObject2.Order;

import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.CheesePizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.GreekPizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.Pizza;

import java.util.Scanner;

public class PizzaOrder {
    private SimpleFactory simpleFactory;

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        return type;
    }

    public PizzaOrder(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            String type = getType();
            Pizza pizza = this.simpleFactory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
            }
        } while (true);
    }
}
