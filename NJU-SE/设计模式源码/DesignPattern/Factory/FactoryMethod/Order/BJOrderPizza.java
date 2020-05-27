package DesignPatthern.Factory.FactoryMethod.Order;

import DesignPatthern.Factory.FactoryMethod.Pizza.BJCheesePizza;
import DesignPatthern.Factory.FactoryMethod.Pizza.BJPepperPizza;
import DesignPatthern.Factory.FactoryMethod.Pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza CreatePizza(String type) {
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
