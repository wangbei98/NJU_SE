package DesignPatthern.Singleton.Type1;

//饿汉式（静态变量）
public class SingletonTest1 {
    public static void main(String[] args) {
        //Single single = new Single();该行会报错，不能new

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);

        System.out.println("instance's hashcode:"+instance1.hashCode());
        System.out.println("instance's hashcode:"+instance2.hashCode());
    }
}

class Singleton{
    //1.构造器私有化，防止外部new
    private Singleton(){}

    //2.本类内部创建对象实例
    private static final Singleton instance=new Singleton();

    //3.提供一个公有的静态方法，返回实例
    public static Singleton getInstance(){
        return instance;
    }
}
