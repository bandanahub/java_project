public class Car extends Vehicle{
    private String gear;
    private String type;

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car() {
    }

    public Car(String gear, String type) {
        this.gear = gear;
        this.type = type;
    }

    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee has a car :" + "make - " + super.getMake() + "\n" +
                "plate -" + super.getPlate() + "\n" +
                "color" + super.getColor() + "\n" +
                "category" +super.getCategory() + "\n" +
                "Gear" + this.gear + "\n" +
                "Type" + this.type + "\n" +
        '}';
    }
}
