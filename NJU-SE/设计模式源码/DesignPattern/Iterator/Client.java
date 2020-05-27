package DesignPatthern.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList=new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());
        new OutputImpl(collegeList);
    }
}
