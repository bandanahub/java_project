import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        int age = calculateAge(dobInput);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter the occupation rate: ");
        double occ_rate = scanner.nextDouble();

        Employee infemployee = new Employee(name, dobInput, age, income, occ_rate);

        scanner.close();

        System.out.println("Employee Information:");
        System.out.println(infemployee.getEmployeeInfo());
    }

    public static int calculateAge(String dobInput) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob;
        try {
            dob = dateFormat.parse(dobInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
            return -1; // Return a placeholder value to indicate an error
        }

        Date currentDate = new Date();
        int years = currentDate.getYear() - dob.getYear();
        int months = currentDate.getMonth() - dob.getMonth();
        int days = currentDate.getDate() - dob.getDate();

        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }

        return years;
    }
}
