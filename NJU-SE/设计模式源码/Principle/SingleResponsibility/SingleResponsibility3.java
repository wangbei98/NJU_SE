package Principle.SingleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

//方式3
//1.这里修改方法没有原来的类做大的修改，只是增加方法
//2.这里虽然没有在类这个级别上遵循单一职责原则，但在方法级别上，仍然是遵循单一职责原则
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水中上运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+"在空中上运行");
    }


}


