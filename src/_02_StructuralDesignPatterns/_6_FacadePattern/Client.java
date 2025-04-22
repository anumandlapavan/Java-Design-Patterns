package _02_StructuralDesignPatterns._6_FacadePattern;

public class Client {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();

        Employee emp = employeeFacade.getEmployeeById(121222);
        System.out.println("Employee Name: " + emp.getName() + ", Email: " + emp.getEmail());

        employeeFacade.insert();
        employeeFacade.updateEmployee("john@example.com");
    }
}
