package DesignPatthern.Factory.SimpleFactory.PizzaObject3.Pizza;

public abstract class Pizza {
    String name;
    public void setName(String name){
        this.name=name;
    }
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" bake");
    }
    public void cut(){
        System.out.println(name+" cut");
    }
    public void box(){
        System.out.println(name+" box");
    }
}
