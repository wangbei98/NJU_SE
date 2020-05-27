package DesignPatthern.Iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    List<College> collegeList;

    public OutputImpl(List<College> collegeList){
        this.collegeList=collegeList;
        this.printCollege();
    }

    public void printCollege(){
        Iterator<College> collegeIterator = collegeList.iterator();
        while (collegeIterator.hasNext()){
            College college = collegeIterator.next();
            Iterator<Department> departmentIterator = college.createIterator();
            System.out.println(college.getName());
            printDepartment(departmentIterator);
            System.out.println("==============");
        }
    }

    public void printDepartment(Iterator<Department> iterator){
        while (iterator.hasNext()){
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }
}
