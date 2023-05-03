import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    String name;
    String position;
    List<Employee> employeeList = new ArrayList<Employee>();
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(Employee employee){
        this.employeeList.add(employee);
        System.out.println(" employee add under manager "+ this.name);
    }
    public void Remove(Employee employee){
        this.employeeList.remove(employee);
        System.out.println(" employee removed under manager "+ this.name);
    }


    @Override
    public void print() {
        System.out.println("employee Name :"+this.name +" position: "+this.position);
        for (Employee e:employeeList)
            e.print();
    }
}
