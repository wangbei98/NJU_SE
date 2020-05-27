package DesignPatthern.Factory.SimpleFactory.PizzaObject3.Pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备胡椒披萨");
    }
}
