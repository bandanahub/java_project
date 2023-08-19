public class Car extends Vehicle{
    private String Gear;
    private String VehicleType;

    public String getGear() {
        return Gear;
    }

    public void setGear(String Gear) {
        this.Gear = Gear;
    }

    public String getType() {
        return VehicleType;
    }

    public void setType(String type) {
        this.VehicleType = VehicleType;
    }

    public Car() {
    }

    public Car(String Gear, String type) {
        this.Gear = Gear;
        this.VehicleType = VehicleType;
    }

    public Car(String make, String plate, String color, String category, String Gear, String type) {
        super(make, plate, color, category);
        this.Gear = Gear;
        this.VehicleType = VehicleType;
    }

    @Override
    public String toString() {
        return "Employee has a car :" + "make - " + super.getMake() + "\n" +
                "plate -" + super.getPlate() + "\n" +
                "color" + super.getColor() + "\n" +
                "category" +super.getCategory() + "\n" +
                "Gear" + this.Gear + "\n" +
                "Type" + this.VehicleType + "\n" +
        '}';
    }
}
