package DesignPatthern.Factory.FactoryMethod.Order;

import DesignPatthern.Factory.FactoryMethod.Pizza.LDCheesePizza;
import DesignPatthern.Factory.FactoryMethod.Pizza.LDGreekPizza;
import DesignPatthern.Factory.FactoryMethod.Pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza CreatePizza(String type) {
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
