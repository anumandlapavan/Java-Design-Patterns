package _02_StructuralDesignPatterns._6_FacadePattern;

public class EmployeeDAO {
    public void insert() {
        System.out.println("Inserting into Employee Table");
    }

    public void updateEmployeeDetails(String emailID) {
        System.out.println("Updating employee details for: " + emailID);
    }

    public Employee getEmployeeDetails(String emailID) {
        System.out.println("Fetching employee using Email: " + emailID);
        return new Employee(1001, "John Doe", emailID);
    }

    public Employee getEmployeeDetails(int empID) {
        System.out.println("Fetching employee using ID: " + empID);
        return new Employee(empID, "Jane Smith", "jane@example.com");
    }
}

