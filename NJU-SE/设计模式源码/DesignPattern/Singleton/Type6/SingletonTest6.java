package DesignPatthern.Singleton.Type6;

//双重检查
public class SingletonTest6 {
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

    //假如双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐
    public static Singleton getInstance() {

        if (Singleton == null) {
            synchronized (Singleton.class) {
                if (Singleton == null)
                    Singleton = new Singleton();
            }
        }
        return Singleton;
    }
}
