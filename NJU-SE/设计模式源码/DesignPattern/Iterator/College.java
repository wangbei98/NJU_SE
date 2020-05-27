package DesignPatthern.Iterator;

import java.util.Iterator;

public interface College {
    public String getName();
    public void addDepartment(String name,String description);
    public Iterator<Department> createIterator();
}
