public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("AndroidD");
        int salary=employee.salary();
        System.out.println("Salary :"+ salary);

    }
}
