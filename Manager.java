public class Manager extends Employee {
    private int travelday;
    private int new_clients;

    public Manager(){}

    public Manager(int travelday, int new_clients){
        this.travelday = travelday;
        this.new_clients = new_clients;
    }
    public Manager(String name, int birthYear, double income, double occRate, int travelday, int new_clients){
        super(name, birthYear, income, occRate);
        this.travelday = travelday;
        this.new_clients = new_clients;
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


    @Override
    public String toString() {
        return "We have a new employee: " + super.getName() + "," +" a manager." ;
    }
}
