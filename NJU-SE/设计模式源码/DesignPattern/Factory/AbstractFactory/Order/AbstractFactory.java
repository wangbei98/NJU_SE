package DesignPatthern.Factory.AbstractFactory.Order;

import DesignPatthern.Factory.AbstractFactory.Pizza.Pizza;

public interface AbstractFactory {
    public Pizza createPizza(String type);
}
