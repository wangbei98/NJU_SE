package DesignPatthern.Factory.FactoryMethod.Pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("正在准备北京芝士披萨");
    }
}
