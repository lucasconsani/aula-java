import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Employee employee;
        employee = new Employee();

        System.out.print("Write the employee's name: ");
        employee.name = sc.next();
        System.out.print("So, now write the gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("How many is the tax?");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        employee.increaseSalary(percent);
        System.out.println("Updated data: " + employee);

        sc.close();
    }

}