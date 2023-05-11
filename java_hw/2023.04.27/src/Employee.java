public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idNumber;
    private static int totalEmployees;
    private static double totalSalary;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee(double salary, String idNumber) {
        this.salary = salary;
        this.idNumber = idNumber;
    }

    public void addSalary(double addSalary) throws SalaryTooHighException {
        if (salary + addSalary > totalSalary) {
            throw new SalaryTooHighException("Added salary exceeds total salary of all employees.");
        }
        salary += addSalary;
        totalSalary += addSalary;
    }

    public void minusSalary(double minusSalary) throws SalaryTooLowException {
        if (salary - minusSalary < 0) {
            throw new SalaryTooLowException("Subtracted salary is less than the minimum wage.");
        }
        salary -= minusSalary;
        totalSalary -= minusSalary;
    }

    public static void showTotalSalary() throws EmptyException {
        if (totalSalary == 0) {
            throw new EmptyException("Total salary is zero.");
        }
        System.out.println("Total salary of all employees: " + totalSalary);
    }

    public static void showTotalEmployee() throws EmptyException {
        if (totalEmployees == 0) {
            throw new EmptyException("No employees.");
        }
        System.out.println("Total number of employees: " + totalEmployees);
    }
}