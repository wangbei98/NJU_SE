package Principle.Demeter;

import java.util.ArrayList;


//实例
//1.有一个公司，下属有各个学校和一个总部，现在要求打印出学校全部员工id和总部员工id
public class Demeter {
    public static void main(String[] args) {
        EmployeeManger employeeManger = new EmployeeManger();
        employeeManger.printAllEmployee(new CollegeEmployeeManger());
    }
}

//总部员工
class Employee{
    int id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//学校的员工
class CollegeEmployee{
    int id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
//该类的直接朋友类：Employee,CollegeEmployeeManger
//非直接朋友：CollegeEmployee，而是一个陌生类，违反了迪米特法则
//总部员工管理
class EmployeeManger{
    //返回总部全部员工
    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee=new Employee();
            employee.setId(i);
            employeeList.add(employee);
        }
        return employeeList;
    }

    //CollegeEmployee
    //打印所有员工id
    public void printAllEmployee(CollegeEmployeeManger collegeEmployeeManger){

        //分析问题
        //1.这里的CollegeEmployee不是EmployeeManger的直接朋友
        //2.CollegeEmployee是以局部变量出现在EmployeeManger类中的
        //3.解决：将输出学校员工的方法，封装到CollegeManger中

        //打印学校员工id
        ArrayList<CollegeEmployee> allCollegeEmployee = collegeEmployeeManger.getAllCollegeEmployee();
        for (CollegeEmployee collegeEmployee:
                allCollegeEmployee) {
            System.out.println("学校员工id："+collegeEmployee.getId());
        }

        System.out.println("--------------");
        //Employee在上面的getAllEmployee方法中出现了，已经是该类的直接朋友
        //打印总部工id
        ArrayList<Employee> allEmployee = this.getAllEmployee();
        for (Employee employee:
                allEmployee) {
            System.out.println("总部员工id："+employee.getId());
        }
    }
}

//学校员工管理
class CollegeEmployeeManger{
    //返回学校所有员工
    public ArrayList<CollegeEmployee> getAllCollegeEmployee(){
        ArrayList<CollegeEmployee> collegeEmployeeList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId(i);
            collegeEmployeeList.add(collegeEmployee);
        }
        return collegeEmployeeList;
    }


}
