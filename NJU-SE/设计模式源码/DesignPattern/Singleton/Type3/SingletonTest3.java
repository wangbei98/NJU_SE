package DesignPatthern.Singleton.Type3;
//懒汉式（线程不安全）
public class SingletonTest3 {
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

    //缺点：线程不安全
    public static Singleton getInstance(){
        if (Singleton==null)
            Singleton=new Singleton();
        return Singleton;
    }
}
