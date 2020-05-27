package DesignPatthern.Factory.AbstractFactory.Pizza;

public abstract class Pizza {
    String type;
    public void setName(String type){
        this.type=type;
    }
    public abstract void prepare();
    public void bake(){
        System.out.println(type+"正在烘焙");
    }
    public void cut(){
        System.out.println(type+"正在剪");
    }
    public void box(){
        System.out.println(type+"正在打包");
    }
}
