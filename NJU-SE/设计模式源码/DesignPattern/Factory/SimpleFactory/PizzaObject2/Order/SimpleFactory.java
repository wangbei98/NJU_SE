package DesignPatthern.Factory.SimpleFactory.PizzaObject2.Order;

import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.CheesePizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.GreekPizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.PepperPizza;
import DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (type.equals("CheesePizza")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (type.equals("GreekPizza")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (type.equals("PepperPizza")){
            pizza=new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
