public class Programmer extends Employee {
    private int linesOfCode;

    public Programmer(String name, int birthYear, int age, double income, int linesOfCode) {
        super(name, birthYear, age, income);
        this.linesOfCode = linesOfCode;
    }

    public Programmer(String name, int birthYear, int age, double income, int linesOfCode, Vehicle vehicle) {
        super(name, birthYear, age, income, vehicle);
        this.linesOfCode = linesOfCode;
    }

    @Override
    public String toString() {
        return "Programmer: " + super.toString() + " - Lines of Code: " + linesOfCode;
    }
}

