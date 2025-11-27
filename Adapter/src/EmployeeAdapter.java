import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements Target{

    private BillingSystem thirdPartyBillingSystem;

    public EmployeeAdapter(BillingSystem thirdPartyBillingSystem) {
        this.thirdPartyBillingSystem = thirdPartyBillingSystem;
    }

    @Override
    public void processCompanySalary(String[][] employeeArray){
        List<Employee> employees = new ArrayList<>();

        for (String[] row : employeeArray){
            int id = Integer.parseInt(row[0]);
            String name = row[1];
            String designation = row[2];
            double salary = Double.parseDouble(row[3]);

            employees.add(new Employee(id, name, designation, salary));
        }

        thirdPartyBillingSystem.ProcessSalary(employees);
    }
}
