package DesignPatthern.Strategy.DuckProject2;

public class Client {
    public static void main(String[] args) {
        Duck beiJingDuck = new BeiJingDuck();
        beiJingDuck.display();
        beiJingDuck.fly();

        System.out.println("=======");
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        System.out.println("=======");
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
    }
}
