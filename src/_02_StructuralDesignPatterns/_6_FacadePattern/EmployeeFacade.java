package _02_StructuralDesignPatterns._6_FacadePattern;

public class EmployeeFacade {
    private EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }

    public void updateEmployee(String email) {
        employeeDAO.updateEmployeeDetails(email);
    }

    public Employee getEmployeeById(int empID) {
        return employeeDAO.getEmployeeDetails(empID);
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeDAO.getEmployeeDetails(email);
    }
}
