package DesignPatthern.Factory.SimpleFactory.PizzaObejct.Order;

import DesignPatthern.Factory.SimpleFactory.PizzaObejct.Pizza.CheesePizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObejct.Pizza.GreekPizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObejct.Pizza.Pizza;

import java.util.Scanner;

public class PizzaOrder {
    public String getType(){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        return type;
    }
    public PizzaOrder(){
        do {
            String type = getType();
            Pizza pizza;
            if (type.equals("CheesePizza")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if (type.equals("GreekPizza")){
                pizza=new GreekPizza();
                pizza.setName("希腊披萨");
            }else {
                System.out.println("没有该类型的披萨");
                continue;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }
}
