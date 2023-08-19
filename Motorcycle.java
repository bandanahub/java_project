public class Motorcycle extends Vehicle{
    private String sidecar;

    public Motorcycle() {
    }

    public String getSidecar() {
        return sidecar;
    }

    public void setSidecar(String sidecar) {
        this.sidecar = sidecar;
    }

    public Motorcycle(String sidecar) {
        this.sidecar = sidecar;
    }

    public Motorcycle(String make, String plate, String color, String category, String sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "Employee has a motorcycle :" + "make - " + super.getMake()  + "\n" +
                "plate -" + super.getPlate() + "\n" +
                "color" + super.getColor()  + "\n" +
                "category" +super.getCategory() + "\n"+
                "SideCar" + this.sidecar +   "\n" +
                '}';
    }
}
