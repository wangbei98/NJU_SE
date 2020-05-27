package Principle.DependecyInversion;

public class DependenceInversion2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.receive(new WeChat());
        student.receive(new Message());
    }
}

interface IReceiver{
    public String getInfo();
}

class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息：你好";
    }
}

class Message implements  IReceiver{

    @Override
    public String getInfo() {
        return "短信消息：Hello World";
    }
}

class Student{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
