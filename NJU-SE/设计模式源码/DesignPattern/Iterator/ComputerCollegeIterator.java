package DesignPatthern.Iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {
    Department[] departments;
    int index = 0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments=departments;
    }

    @Override
    public boolean hasNext() {
        if (departments[index] == null)
            return false;
        else {
            return true;
        }
    }

    @Override
    public Department next() {
        return departments[index++];
    }
}
