package Principle.Demeter;

import java.util.ArrayList;


//实例
//1.有一个公司，下属有各个学校和一个总部，现在要求打印出学校全部员工id和总部员工id
public class Demeter2 {
    public static void main(String[] args) {

        System.out.println("-----使用迪米特法则的改进-----");

        Employee2Manger Employee2Manger = new Employee2Manger();
        Employee2Manger.printAllEmployee2();

        System.out.println("---------------------------");

        CollegeEmployee2Manger collegeEmployee2Manger = new CollegeEmployee2Manger();
        collegeEmployee2Manger.printAllCollegeEmployee2();
    }
}

//总部员工
class Employee2{
    int id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//学校的员工
class CollegeEmployee2{
    int id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


//总部员工管理
class Employee2Manger{
    //返回总部全部员工
    public ArrayList<Employee2> getAllEmployee2(){
        ArrayList<Employee2> Employee2List = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee2 Employee2=new Employee2();
            Employee2.setId(i);
            Employee2List.add(Employee2);
        }
        return Employee2List;
    }

    //CollegeEmployee2
    //打印所有员工id
    public void printAllEmployee2(){

        //Employee2在上面的getAllEmployee2方法中出现了，已经是该类的直接朋友
        //打印总部工id
        ArrayList<Employee2> allEmployee2 = this.getAllEmployee2();
        for (Employee2 Employee2:
                allEmployee2) {
            System.out.println("总部员工id："+Employee2.getId());
        }
    }
}

//学校员工管理
class CollegeEmployee2Manger{
    //返回学校所有员工
    public ArrayList<CollegeEmployee2> getAllCollegeEmployee2(){
        ArrayList<CollegeEmployee2> collegeEmployee2List = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CollegeEmployee2 collegeEmployee2 = new CollegeEmployee2();
            collegeEmployee2.setId(i);
            collegeEmployee2List.add(collegeEmployee2);
        }
        return collegeEmployee2List;
    }

    public void printAllCollegeEmployee2(){
        ArrayList<CollegeEmployee2> allCollegeEmployee2 = this.getAllCollegeEmployee2();
        for (CollegeEmployee2 collegeEmployee2:
                allCollegeEmployee2) {
            System.out.println("学校员工id："+collegeEmployee2.getId());
        }
    }
}
