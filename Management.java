import java.util.ArrayList;
import java.util.List;

public class Management {
    static double workingDaysPerMonth = 20.0;

    List<Employee> employees = new ArrayList<>();

    Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle", false);
    Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", "Not for Race", true);

    Car vt1 = Car("Lamborghini", "Custom Plate", "White", "Family", Gear.Manual, "Sport");
    Car vt2 = Car("BMW", "Custom Plate", "Black", "Family", Gear.Automatic, "Sedan");
    Car vt3 = Car("Renault Clio", "Custom Plate", "Blue", "Family", Gear.Manual, "Hatchback");
    Car vt4 = Car("Mazda", "Custom Plate", "White", "Family", Gear.Automatic, "SUV");

    void hireTest1() {
        employees.add(Manager("Serge", 1985, 30, 4));
        employees.add(Manager("Cindy", 1974, 20, 6, 80));
        employees.add(Programmer("Paul", 1993, 3, 75));
        employees.add(Tester("Pierre", 1987, 124, 50));
        employees.add(Programmer("Matt", 1981, 5, 110));
        employees.add(Programmer("Sarah", 1986, 3));
    }

    void hireTest2() {
        employees.clear();
        employees.add(Manager("Serge", 1985, 30, 4, vt1));
        employees.add(Manager("Cindy", 1974, 20, 6, 80, vt2));
        employees.add(Programmer("Paul", 1993, 3, 75, m1));
        employees.add(Tester("Pierre", 1987, 124, 50, m2));
        employees.add(Programmer("Matt", 1981, 5, 110, vt4));
        employees.add(Programmer("Sarah", 1986, 3, vt3));
        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }
    }

    void hireTest3() {
        employees.clear();
        Employee Serge = Manager("Serge", 1985, 30, 4, vt1);
        Employee Cindy = Manager("Cindy", 1974, 20, 6, 80, vt2);
        Employee Paul = Programmer("Paul", 1993, 3, 75, m1);
        Employee Pierre = Tester("Pierre", 1987, 124, 50, m2);
        Employee Matt = Programmer("Matt", 1981, 5, 110, vt4);
        Employee Sarah = Programmer("Sarah", 1986, 3, vt3);

        Contract p1 = Permanent(2, true, 6000, 200, 17);
        Contract p2 = Permanent(3, false, 5000, 150, 19);
        Contract t1 = Temporary(60, 30);
        Contract t2 = Temporary(50, 60);
        Contract p3 = Permanent(1, true, 4000, 100, 20);
        Contract p4 = Permanent(4, true, 4500, 100, 19);
        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);

        employees.add(Serge);
        employees.add(Cindy);
        employees.add(Paul);
        employees.add(Pierre);
        employees.add(Matt);
        employees.add(Sarah);

        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");

        // updating Matt's contract
        Contract p5 = Permanent(1, true, 5000, 200, 30);
        Matt.signContract(p5);

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");

    }
}
