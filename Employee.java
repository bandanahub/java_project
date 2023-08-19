import java.util.Calendar;

public class Employee {
    private String name;
    private int birthYear;
    private double income;
    private double occRate;

    public Employee() {
       //empty constructor
    }


    public Employee(String name, int birthYear, double income, double occRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.income = income;
        setOccRate(occRate);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getOccRate() {
        return occRate;
    }




    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.birthYear;
    }


    public void setOccRate(double occRate) {
        if (occRate < 10.0) {
            this.occRate = 10.0;
        } else if (occRate > 100.0) {
            this.occRate = 100.0;
        } else {
            this.occRate = occRate;
        }
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nBirth Year: " + birthYear + "\nAge: " + getAge() +
                "\nIncome: " + income + "\nOccupation Rate: " + occRate + "%" ;

    }
}
