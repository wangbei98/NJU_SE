package Principle.DependecyInversion;

public class DependenceInversion5 {
}

//方法3.通过setter方法传递
interface IOpenAndClose3{
    public void open();
}

interface ITV3{
    public void play();
}

class OpenAndClose3 implements IOpenAndClose3{

    private ITV3 tv;
    public void setTV(ITV3 tv){
        this.tv=tv;
    }


    @Override
    public void open() {
        this.tv.play();
    }
}