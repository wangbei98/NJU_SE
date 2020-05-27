package DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备材料");
    }
}
