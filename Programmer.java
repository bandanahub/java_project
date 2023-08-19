public class Programmer  extends Employee{
    private int no_projects;


    public Programmer() {
    }

    public Programmer(int no_projects) {
        this.no_projects = no_projects;
    }

    public Programmer(String name, int birthYear, double income, double occRate, int no_projects) {
        super(name, birthYear, income, occRate);
        this.no_projects = no_projects;
    }

    public int getNo_projects() {
        return no_projects;
    }

    public void setNo_projects(int no_projects) {
        this.no_projects = no_projects;
    }

    @Override
    public String toString() {
        return "We have a new employee : " + super.getName() + "," + " a programmer." ;
//                "Age - " + super.getAge() +
//                super.getName() + "has an employment rate :" + super.getOccRate() + "%" + " and completed " +this.no_projects +" projects."+

//                '}';
    }
}
