import java.util.Scanner;
import model.Employee;
import model.ContractEmployee;
import model.HourlyEmployee;
import model.FullTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        ContractEmployee[] contractEmployees = new ContractEmployee[10];
        HourlyEmployee[] hourlyEmployees = new HourlyEmployee[10];
        FullTimeEmployee[] fullTimeEmployees = new FullTimeEmployee[10];

        int employeeCount = 0;
        int contractEmployeeCount = 0;
        int hourlyEmployeeCount = 0;
        int fullTimeEmployeeCount = 0;

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Hourly Employee");
            System.out.println("3. Add Contract Employee");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    if (fullTimeEmployeeCount < fullTimeEmployees.length) {
                        System.out.print("Enter Full-Time Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Monthly Salary: ");
                        double salary = sc.nextDouble();
                        fullTimeEmployees[fullTimeEmployeeCount++] = new FullTimeEmployee(name, salary);
                        System.out.println("Full-Time Employee added.");
                    } else {
                        System.out.println("No more space for Full-Time Employees.");
                    }
                    break;
                case 2:
                    if (hourlyEmployeeCount < hourlyEmployees.length) {
                        System.out.print("Enter Hourly Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Hourly Rate: ");
                        double hourlyRate = sc.nextDouble();
                        System.out.print("Enter Hours Worked: ");
                        int hoursWorked = sc.nextInt();
                        hourlyEmployees[hourlyEmployeeCount++] = new HourlyEmployee(name, hourlyRate, hoursWorked);
                        System.out.println("Hourly Employee added.");
                    } else {
                        System.out.println("No more space for Hourly Employees.");
                    }
                    break;
                case 3:
                    if (contractEmployeeCount < contractEmployees.length) {
                        System.out.print("Enter Contract Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Project Rate: ");
                        double projectRate = sc.nextDouble();
                        System.out.print("Enter Hours Worked: ");
                        int hoursWorked = sc.nextInt();
                        contractEmployees[contractEmployeeCount++] = new ContractEmployee(name, projectRate, hoursWorked);
                        System.out.println("Contract Employee added.");
                    } else {
                        System.out.println("No more space for Contract Employees.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}