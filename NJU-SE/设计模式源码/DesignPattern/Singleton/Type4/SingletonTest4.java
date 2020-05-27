package DesignPatthern.Singleton.Type4;
//懒汉式（线程安全，同步方法）
public class SingletonTest4 {
    public static void main(String[] args) {
        //Singleton Singleton = new Singleton();该行会报错，不能new

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);

        System.out.println("instance's hashcode:"+instance1.hashCode());
        System.out.println("instance's hashcode:"+instance2.hashCode());
    }
}

class Singleton{
    private Singleton(){}
    private static Singleton Singleton;

    //提供一个静态公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (Singleton==null)
            Singleton=new Singleton();
        return Singleton;
    }
}
