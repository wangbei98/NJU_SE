package Principle.OpenClose;

public class OpenClose2 {
    public static void main(String[] args) {
        MyGraphicEditor myGraphicEditor = new MyGraphicEditor();
        myGraphicEditor.drawShape(new MyCircle());
        myGraphicEditor.drawShape(new MyRectangle());
        myGraphicEditor.drawShape(new MyTriangle());
    }
}

class MyGraphicEditor{
    public void drawShape(MyShape s){
        s.draw();
    }
}

abstract class MyShape{
    int mType;
    public abstract void draw();
}

class MyCircle extends MyShape{
    MyCircle(){
        super.mType=1;
    }
    @Override
    public void draw(){
        System.out.println("绘制圆形");
    }
}

class MyRectangle extends MyShape{
    MyRectangle(){
        super.mType=2;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class MyTriangle extends MyShape{
    MyTriangle(){
        super.mType=3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
