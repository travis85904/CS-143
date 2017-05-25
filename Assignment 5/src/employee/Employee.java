/**
 * Travis Davis - 5/15/17
 */
package employee;


public class Employee {
    private String employeeName;
    private int employeeNumber;

    public Employee(String employeeName, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return (int)employeeNumber;
    }
}
