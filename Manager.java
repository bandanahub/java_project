public class Manager extends Employee {
    private int travelday;
    private int new_clients;

    public Manager(){}

    public Manager(int travelday, int new_clients){
        this.travelday = travelday;
        this.new_clients = new_clients;
    }
    public Manager(String name, int birthYear, int new_clients, int travelday){
        super(name, birthYear, new_clients, travelday);

    }

    public Manager(String name, int birthYear, double income, double occRate, int travelday, int new_clients, String make, String plate, String color, String category){
        super(name, birthYear, income, occRate);
        this.travelday = travelday;
        this.new_clients = new_clients;
    }

    public Manager(String name, int birthYear, int new_clients, int travelday, Car car){
        super(name, birthYear, new_clients, travelday);

    }

    public int getTravelday() {
        return travelday;
    }

    public void setTravelday(int travelday) {
        this.travelday = travelday;
    }

    public int getNew_clients() {
        return new_clients;
    }

    public void setNew_clients(int new_clients) {
        this.new_clients = new_clients;
    }

    public double annualIncome() {
        return getIncome() * (12 - (travelday / 20.0)) * (getOccRate() / 100.0);
    }


    @Override
    public String toString() {
        return "We have a new employee: " + super.getName() + "," +" a manager.";


//                "Age - " + super.getAge()+
//                super.getName() + "has an employment rate :" + super.getOccRate() + "%" + " travelled " +this.travelday +" days and has brought " +this.new_clients+" clients."+
//                '}';

    }
}
