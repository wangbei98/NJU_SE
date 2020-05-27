package DesignPatthern.Factory.FactoryMethod.Order;

import DesignPatthern.Factory.FactoryMethod.Pizza.Pizza;

import java.util.Scanner;

public abstract class OrderPizza {
    public OrderPizza(){
        while (true){
            String type = getType();
            Pizza pizza = CreatePizza(type);
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

    public abstract Pizza CreatePizza(String type);

    public String getType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
