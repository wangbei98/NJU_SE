package Principle.DependecyInversion;

public class DependenceInversion {
}


//完成Person接受消息的功能
//方式1完成
//1.简单，比较容易想到
//2.如果我们获取的对象是微信，如短信，微信等，则新增类，同时Person也要增加相应的方法
//3.解决思路：引入一个抽象的接口Receiver，表示接受者，这样Person类与接口Receiver发生依赖
//   因为Email，微信等等都属于接受的范围，他们各自实现Receiver，接口就OK，这样我们就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信箱：Hello World";
    }
}

