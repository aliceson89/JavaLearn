package vehicles;

import vehicle.Vehicle;

public class Bike  extends Vehicle {

    private String handle;

    //Default Constructor
    public Bike(){
        //this call Default Constructor in Vehicle Class
        super();
        this.handle = "short";
    }
    //Second Constructor
    public Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
        //this call Second Constructor in Vehicle Class
        super(engine,wheels,seats,fuelTank,lights);
        this.handle = handle;
    }



    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }

    public void run(){
        System.out.println("Running bike");
        System.out.println(toString());
    }
}
