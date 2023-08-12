class Employee {
    private String name;
    private int DOB;
    private int age;
    private double income;
    private double occ_rate;

    public Employee(String name, int DOB, int age, double income, double occ_rate) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.income = income;
        this.occ_rate = occ_rate;
    }

    public Employee(String name, int DOB, int age) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setOccupationRate(double occ_rate) {
        this.occ_rate = occ_rate;
    }

    public String getName() {
        return name;
    }

    public int getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public double getOccupationRate() {
        return occ_rate;
    }

    public String getEmployeeInfo() {
        return "Name: " + name + "\nDOB: " + DOB + "\nAge: " + age +
                "\nIncome: " + income + "\nOccupation Rate: " + occ_rate + "%";
    }

}