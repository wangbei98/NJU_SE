package DesignPatthern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege(){
        departmentList=new ArrayList<>();
        addDepartment("网络安全","NO.1");
        addDepartment("大数据","NO.2");
        addDepartment("运维","NO.3");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department();
        department.setName(name);
        department.setDescription(description);
        departmentList.add(department);
    }

    @Override
    public Iterator<Department> createIterator() {
            return new InfoCollegeIterator(departmentList);
    }
}
