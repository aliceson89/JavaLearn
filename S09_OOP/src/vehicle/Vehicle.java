package vehicle;

public class Vehicle {

    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    //Default Constructor
    public Vehicle(){
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuelTank = 35;
        this.lights = "LED";
    }
    //Second Constructor
    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }

    public void run(){
        System.out.println("Running vehicle");
    }
}
