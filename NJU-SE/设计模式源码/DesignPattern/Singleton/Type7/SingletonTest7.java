package DesignPatthern.Singleton.Type7;

//静态内部类完成
public class SingletonTest7 {
    public static void main(String[] args) {
        //Singleton Singleton = new Singleton();该行会报错，不能new

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("instance's hashcode:" + instance1.hashCode());
        System.out.println("instance's hashcode:" + instance2.hashCode());
    }
}

//静态内部类完成，推荐使用
class Singleton {

    private Singleton() {}


    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
