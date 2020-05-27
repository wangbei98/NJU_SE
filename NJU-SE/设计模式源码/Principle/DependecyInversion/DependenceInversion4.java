package Principle.DependecyInversion;

public class DependenceInversion4 {
    public static void main(String[] args) {
        XiaoMi xiaoMi = new XiaoMi();
        Sony sony = new Sony();
        OpenAndClose2 openAndClose = new OpenAndClose2(xiaoMi);
        OpenAndClose2 openAndClose2 = new OpenAndClose2(sony);
        openAndClose.open();
        openAndClose2.open();
    }
}

//方式2：通过构造方法实现
interface IOpenAndClose2{
    public void open();
}

interface ITV2{
    public void play();
}

class OpenAndClose2 implements IOpenAndClose2{

    private ITV2 tv;//成员变量

    public OpenAndClose2(ITV2 tv){//构造器
        this.tv=tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class XiaoMi implements ITV2{

    @Override
    public void play() {
        System.out.println("播放鬼畜");
    }
}

class Sony implements  ITV2{

    @Override
    public void play() {
        System.out.println("播放阿凡达");
    }
}