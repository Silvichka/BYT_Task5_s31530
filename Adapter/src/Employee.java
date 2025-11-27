public class Employee {

    private final int ID;
    private final String Name;
    private String Designation;
    private final double Salary;

    public Employee(int ID, String name, String designation, double salary) {
        this.ID = ID;
        Name = name;
        Designation = designation;
        Salary = salary;
    }

    public int getID() { return ID; }

    public String getName() { return Name; }

    public double getSalary() { return Salary; }

    public String getDesignation() { return Designation; }
}
