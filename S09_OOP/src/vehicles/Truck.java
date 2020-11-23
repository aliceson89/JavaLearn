package vehicles;

import vehicle.Vehicle;

public class Truck extends Vehicle {

    private String streering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck() {
        super();
        this.streering = streering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String streering, String musicSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.streering = streering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getStreering() {
        return streering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "streering='" + streering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                "} " + super.toString();
    }
}
