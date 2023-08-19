public class Motorcycle extends Vehicle{
    private Boolean sidecar;

    public Motorcycle() {
    }

    public Boolean getSidecar() {
        return sidecar;
    }

    public void setSidecar(Boolean sidecar) {
        this.sidecar = sidecar;
    }

    public Motorcycle(Boolean sidecar) {
        this.sidecar = sidecar;
    }

    public Motorcycle(String make, String plate, String color, String category, Boolean sidecar) {
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
