package DesignPatthern.Iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int index=0;

    public ComputerCollege(){
        departments=new Department[5];
        addDepartment("Java","NO.1");
        addDepartment("C++","NO.2");
        addDepartment("PHP","NO.3");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department=new Department();
        department.setName(name);
        department.setDescription(description);
        departments[index++]=department;
    }


    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
