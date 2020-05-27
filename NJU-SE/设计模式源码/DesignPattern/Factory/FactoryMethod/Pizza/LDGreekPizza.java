package DesignPatthern.Factory.FactoryMethod.Pizza;

public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("正在准备伦敦希腊披萨");
    }
}
