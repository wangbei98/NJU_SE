package Principle.LiskovSubstitution;

public class LiskovSubstitution2 {
}

//创建一个更为基础的类
class Base{
    //把更基础的方法和成员写到Base类
}

class C extends Base{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class D extends Base{
    //如果B需要用到A类的方法，使用组合关系
    private C c=new C();


    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }

    //我们仍然想使用A的方法
    public int func3(int a,int b){
        return this.c.func1(a,b);
    }
}