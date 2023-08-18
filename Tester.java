ublic class Tester extends Employee {
    private int numberOfBugsFound;

    public Tester(String name, int birthYear, int age, double income, int numberOfBugsFound) {
        super(name, birthYear, age, income);
        this.numberOfBugsFound = numberOfBugsFound;
    }

    public Tester(String name, int birthYear, int age, double income, int numberOfBugsFound, Vehicle vehicle) {
        super(name, birthYear, age, income, vehicle);
        this.numberOfBugsFound = numberOfBugsFound;
    }

    @Override
    public String toString() {
        return "Tester: " + super.toString() + " - Bugs Found: " + numberOfBugsFound;
    }
}