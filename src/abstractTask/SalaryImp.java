package abstractTask;

public class SalaryImp {
    public static void main(String[] args) {
        FUllTimeEmployee fUllTimeEmployee = new FUllTimeEmployee();
        fUllTimeEmployee.calculateSalary(340);
        fUllTimeEmployee.displayName();

        Employee emp = new PartTimeEmployee();
        emp.displayName();
        emp.calculateSalary(340);
    }
}
