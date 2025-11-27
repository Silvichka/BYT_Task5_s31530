import java.util.List;

public class BillingSystem {

    public void ProcessSalary(List<Employee> employees){
        for(Employee e : employees){
            System.out.println("Rs." + e.getSalary() + " Salary Credited to " + e.getName() + " Account");
        }
    }

}
