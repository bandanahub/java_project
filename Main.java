public class Main {
    public static void main(String[] args) {
        // test1
        Manager manager1 = new Manager("Sergi", 2003, 7000,9,15, 15);
        Manager manager2 = new Manager("Cindy", 2003, 7000,9,15, 15);

        Programmer programmer1 = new Programmer("Paul", 1999, 8700,200,2);
        Tester tester1 = new Tester("Pierre", 1994, 679000,4,89);
        Programmer programmer2 = new Programmer("Matt", 1999, 8700,200,2);
        Programmer programmer3 = new Programmer("Sarah", 1999, 8700,200,2);
        System.out.println("Test 1:");
        System.out.println(manager1.toString());
        System.out.println(manager2.toString());
        System.out.println(programmer1.toString());
        System.out.println(tester1.toString());
        System.out.println(programmer2.toString());
        System.out.println(programmer3.toString());

        //Test 2
//        Car car = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic","Sedan");
//        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle","Without");
//        System.out.println("Test 2:");
//
//        System.out.println(car.toString());
//        System.out.println(motorcycle.toString());


    }
}
