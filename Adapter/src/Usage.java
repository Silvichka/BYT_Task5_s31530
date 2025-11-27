public class Usage {

    public static void main(String[] args) {

        String[][] employeesArray = {
                {"1", "Alice", "Toronto", "5000"},
                {"2", "Bob",  "Tokyo",  "6000"},
                {"3", "Charlie", "Warsaw", "5500"}
        };

        BillingSystem billingSystem = new BillingSystem();

        Target adapter = new EmployeeAdapter(billingSystem);

        adapter.processCompanySalary(employeesArray);
    }

}
