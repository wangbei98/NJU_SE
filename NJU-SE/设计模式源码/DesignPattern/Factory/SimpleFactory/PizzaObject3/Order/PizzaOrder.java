package DesignPatthern.Factory.SimpleFactory.PizzaObject3.Order;

import DesignPatthern.Factory.SimpleFactory.PizzaObject3.Pizza.Pizza;

import java.util.Scanner;

public class PizzaOrder {

    public PizzaOrder(){
        do {
            String type = getType();
            Pizza pizza = SimpleFactory.createPizza(type);
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

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        return type;
    }


}
