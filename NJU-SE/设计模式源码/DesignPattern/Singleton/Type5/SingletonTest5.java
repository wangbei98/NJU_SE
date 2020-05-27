package DesignPatthern.Singleton.Type5;

//懒汉式（线程安全，同步代码块）
public class SingletonTest5 {
    public static void main(String[] args) {
        //Singleton Singleton = new Singleton();该行会报错，不能new

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance's hashcode:" + instance1.hashCode());
        System.out.println("instance's hashcode:" + instance2.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton Singleton;

    public static Singleton getInstance() {
        //无法保证线程安全
        if (Singleton == null) {
            synchronized (Singleton.class) {
                Singleton = new Singleton();
            }
        }
        return Singleton;
    }
}
