public class Application {

    public static void main(String[] args){
        Manager Ceo = new Manager("himanshu","CEO");

        Manager manager1 = new Manager("abhishek","manager");
        Manager manager2 = new Manager("reema","manager");

        Employee employee1 = new Staff("dharaneshwar","staff");
        Employee employee2 = new Staff("gowtham","staff");
        Employee employee3 = new Staff("john","staff");
        Employee employee4 = new Staff("smith","staff");

        Ceo.employeeList.add(manager1);
        Ceo.employeeList.add(manager2);

        manager1.employeeList.add(employee1);
        manager1.employeeList.add(employee2);

        manager2.employeeList.add(employee3);
        manager2.employeeList.add(employee4);

        Ceo.print();


    }
}
