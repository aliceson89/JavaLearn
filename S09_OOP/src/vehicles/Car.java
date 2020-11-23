package vehicles;

import vehicle.Vehicle;

public class Car extends Vehicle {

    private String streering;
    private String musicSystem;
    private String air_conditioner;
    private String fridge;
    private String entertainment_System;

    public Car() {
        super();
        this.streering = streering;
        this.musicSystem = musicSystem;
        this.air_conditioner = air_conditioner;
        this.fridge = fridge;
        this.entertainment_System = entertainment_System;
    }

    public Car(String engine, int wheels, int seats, int fuelTank, String lights, String streering, String musicSystem, String air_conditioner, String fridge, String entertainment_System) {
        super(engine, wheels, seats, fuelTank, lights);
        this.streering = streering;
        this.musicSystem = musicSystem;
        this.air_conditioner = air_conditioner;
        this.fridge = fridge;
        this.entertainment_System = entertainment_System;
    }

    public String getStreering() {
        return streering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAir_conditioner() {
        return air_conditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainment_System() {
        return entertainment_System;
    }

    @Override
    public String toString() {
        return "Car{" +
                "streering='" + streering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", air_conditioner='" + air_conditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainment_System='" + entertainment_System + '\'' +
                "} " + super.toString();
    }
}
