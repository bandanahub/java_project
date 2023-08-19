public class Main {
    public static void main(String[] args) {
        // creating objects
        Manager manager = new Manager("Bandana", 2003, 7000,9,15, 15);
        Programmer programmer = new Programmer("Neha", 1999, 8700,200,2);
        Tester tester = new Tester("Bijay", 1994, 679000,4,89);

        System.out.println(manager.toString());
        System.out.println(programmer.toString());
        System.out.println(tester.toString());
    }
}

