package DesignPatthern.Factory.AbstractFactory.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备伦敦芝士披萨");
    }
}
