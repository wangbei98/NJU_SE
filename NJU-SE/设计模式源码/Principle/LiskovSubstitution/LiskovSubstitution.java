package Principle.LiskovSubstitution;

public class LiskovSubstitution {
}

class A{

    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

//新增了一个新功能：本意是求出两个数的和，再与9求和
class B extends A{

    //这里重写了A类的方法，可能是无意识的
    @Override
    public int func1(int num1, int num2) {
        return num1+num2;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
}