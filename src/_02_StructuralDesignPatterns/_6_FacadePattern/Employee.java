package _02_StructuralDesignPatterns._6_FacadePattern;

public class Employee {
    private int empID;
    private String name;
    private String email;


    public Employee() {}
    public Employee(int empID, String name, String email) {
        this.empID = empID;
        this.name = name;
        this.email = email;
    }

    public int getEmpID() { return empID; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setEmpID(int empID) { this.empID = empID; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}

