/**
 * Travis Davis - 5/15/17
 */
package employee;

public class Test {
    private static EmployeeMap employeeMap = new EmployeeMap();

    public static void main(String[] args) {
        employeeMap.put(new Employee("Travis",155));
        employeeMap.put(new Employee("David",255));
        employeeMap.put(new Employee("John",353));

        System.out.println(employeeMap.getEmployeeName(155));
        System.out.println(employeeMap.getEmployeeName(255));
        System.out.println(employeeMap.getEmployeeName(353));
    }
}
