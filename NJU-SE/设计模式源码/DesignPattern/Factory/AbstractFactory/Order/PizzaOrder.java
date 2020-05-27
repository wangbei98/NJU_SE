package DesignPatthern.Factory.AbstractFactory.Order;

import DesignPatthern.Factory.AbstractFactory.Pizza.Pizza;

import java.util.Scanner;

public  class PizzaOrder {
    AbstractFactory factory;

    public PizzaOrder(AbstractFactory factory){
        this.factory=factory;
        while (true){
            String type = getType();
            Pizza pizza = factory.createPizza(type);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("披萨订购失败");
            }
        }
    }



    public String getType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
