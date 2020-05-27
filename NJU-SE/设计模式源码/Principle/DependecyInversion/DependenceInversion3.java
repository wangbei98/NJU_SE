package Principle.DependecyInversion;


public class DependenceInversion3 {
    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new TCL());
        openAndClose.open(new Samsung());
    }
}

//方式1：通过接口传递实现依赖
interface IOpenAndClose{
    public void open(ITV tv);
}

interface ITV{
    public void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

class TCL implements ITV{

    @Override
    public void play() {
        System.out.println("播放还珠格格");
    }
}

class Samsung implements ITV{

    @Override
    public void play() {
        System.out.println("播放蜘蛛侠");
    }
}


