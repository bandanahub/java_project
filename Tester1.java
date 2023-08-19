public class Tester extends Employee {
    private int numberOfBugsFound;

    public int getNumberOfBugsFound() {
        return numberOfBugsFound;
    }

    public void setNumberOfBugsFound(int numberOfBugsFound) {
        this.numberOfBugsFound = numberOfBugsFound;
    }

    public Tester() {
    }

    public Tester(int numberOfBugsFound) {
        this.numberOfBugsFound = numberOfBugsFound;
    }

    public Tester(String name, int birthYear, double income, double occRate, int numberOfBugsFound) {
        super(name, birthYear, income, occRate);
        this.numberOfBugsFound = numberOfBugsFound;
    }

    public Tester(String name, int birthYear, double income, double occRate, int numberOfBugsFound, Motorcycle motor) {
        super(name, birthYear, income, occRate);
        this.numberOfBugsFound = numberOfBugsFound;
    }
    @Override
    public String toString() {
        return "We have a new employee : "+ super.getName()+ ","+ " a tester.";
//                "Age - " + super.getAge() + "\n"+
//                super.getName() + "has an employment rate :" + super.getOccRate() + "%" + " and corrected " +this.numberOfBugsFound +" bugs."+
//                '}';
    }
}