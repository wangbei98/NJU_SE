package DesignPatthern.Factory.AbstractFactory.Order;

import DesignPatthern.Factory.AbstractFactory.Pizza.BJCheesePizza;
import DesignPatthern.Factory.AbstractFactory.Pizza.BJPepperPizza;
import DesignPatthern.Factory.AbstractFactory.Pizza.Pizza;



public class BJFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("BJCheesePizza".equals(type)) {
            pizza = new BJCheesePizza();
            pizza.setName("北京芝士披萨");
        } else if ("BJPepperPizza".equals(type)) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }

}
