package DesignPatthern.Factory.AbstractFactory.Order;

import DesignPatthern.Factory.AbstractFactory.Pizza.LDCheesePizza;
import DesignPatthern.Factory.AbstractFactory.Pizza.LDGreekPizza;
import DesignPatthern.Factory.AbstractFactory.Pizza.Pizza;



public class LDFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if ("LDCheesePizza".equals(type)){
            pizza=new LDCheesePizza();
            pizza.setName("伦敦芝士披萨");
        }else if ("LDGreekPizza".equals(type)){
            pizza=new LDGreekPizza();
            pizza.setName("伦敦希腊披萨");
        }
        return pizza;
    }
}
