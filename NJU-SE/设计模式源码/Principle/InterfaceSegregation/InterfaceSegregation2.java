package Principle.InterfaceSegregation;

public class InterfaceSegregation2 {
    public static void main(String[] args) {
        MyA a = new MyA();
        a.depend1(new MyB());
        a.depend2(new MyB());
        a.depend3(new MyB());

        MyC c = new MyC();
        c.depend1(new MyD());
        c.depend4(new MyD());
        c.depend5(new MyD());
    }
}

interface MyInterface1 {
    void operation1();
}

interface MyInterface2 {
    void operation2();

    void operation3();
}

interface MyInterface3 {
    void operation4();

    void operation5();
}

class MyB implements MyInterface1, MyInterface2 {

    @Override
    public void operation1() {
        System.out.println("MyB实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("MyB实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("MyB实现了operation3");
    }
}

class MyD implements MyInterface1,MyInterface3 {

    @Override
    public void operation1() {
        System.out.println("MyD实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("MyD实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("MyD实现了operation5");
    }

}

class MyA{
    public void depend1(MyInterface1 i){
        i.operation1();
    }
    public void depend2(MyInterface2 i){
        i.operation2();
    }
    public void depend3(MyInterface2 i){
        i.operation3();
    }
}

class MyC{
    public void depend1(MyInterface1 i){
        i.operation1();
    }
    public void depend4(MyInterface3 i){
        i.operation4();
    }
    public void depend5(MyInterface3 i){
        i.operation5();
    }

}
