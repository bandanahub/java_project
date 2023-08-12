import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the date of birth: ");
        int DOB = scanner.nextInt();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter the occupation rate: ");
        double occ_rate = scanner.nextDouble();

        Employee infemployee = new Employee(name, DOB, age, income, occ_rate);

        scanner.close();


        System.out.println("Employee Information:");
        System.out.println(infemployee.getEmployeeInfo());
    }
}