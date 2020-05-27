package Principle.OpenClose;

public class OpenClose {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//使用方
class GraphicEditor{
    public void drawShape(Shape s){
        if (s.mType==1)
            drawRectangle(s);
        else if (s.mType==2)
            drawCircle(s);
        else if (s.mType==3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r){
        System.out.println("绘制矩形");
    }

    //绘制圆形
    public void drawCircle(Shape r){
        System.out.println("绘制圆形");
    }

    //绘制三角形
    public void drawTriangle(Shape r){
        System.out.println("绘制三角形");
    }
}

class Shape{
     int mType;
}

class Rectangle extends Shape{
    Rectangle(){
        super.mType=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.mType=2;
    }
}

//新增三角形
class Triangle extends Shape{
    Triangle(){
        super.mType=3;
    }
}


