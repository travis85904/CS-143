/**
 * Travis Davis - 5/15/17
 */
package employee;

import java.util.HashMap;

public class EmployeeMap {
    private HashMap<Integer, String> employees = new HashMap<>();

    public EmployeeMap(Employee employee){
        employees.put(employee.getEmployeeNumber(), employee.getEmployeeName());
    }
    public EmployeeMap(){}

    public void put(Employee employee) {
        employees.put(employee.getEmployeeNumber(), employee.getEmployeeName());
    }

    public String getEmployeeName(Integer number) {
        return employees.get(number);
    }
}
