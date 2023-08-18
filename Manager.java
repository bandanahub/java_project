public class Manager extends Employee {
    private int numSubordinates;

    public Manager(String name, int birthYear, int age, double income, int numSubordinates) {
        super(name, birthYear, age, income);
        this.numSubordinates = numSubordinates;
    }

    public Manager(String name, int birthYear, int age, double income, int numSubordinates, Vehicle vehicle) {
        super(name, birthYear, age, income, vehicle);
        this.numSubordinates = numSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: " + super.toString() + " - Number of Subordinates: " + numSubordinates;
    }
}
