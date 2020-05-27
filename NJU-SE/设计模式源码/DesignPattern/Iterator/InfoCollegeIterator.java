package DesignPatthern.Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departmentList;
    int index = 0;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size())
            return false;
        else {
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index++);
    }
}
