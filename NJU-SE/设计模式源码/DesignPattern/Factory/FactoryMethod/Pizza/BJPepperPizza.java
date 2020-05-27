package DesignPatthern.Factory.FactoryMethod.Pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("正在准备北京胡椒披萨");
    }
}
