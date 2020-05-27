package Principle.SingleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        AirVehicle airVehicle = new AirVehicle();

        roadVehicle.run("汽车");
        waterVehicle.run("轮船");
        airVehicle.run("飞机");
    }
}

//方式2
//1.遵循单一职责原则
//2.但这样的改动很大，即将类分解，同时会修改客户端
//3.改进：直接修改Vehicle类，改动的代码会比较少
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println("水上运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"天空运行");
    }
}