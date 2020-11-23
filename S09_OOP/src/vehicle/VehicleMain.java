package vehicle;

import vehicles.Bike;

public class VehicleMain {

    public static void main (String[] args){

        Bike bike = new Bike();
        System.out.println(bike.getHandle());
        //will call Vehicles Constructor default value
        System.out.println(bike.getEngine());

        //this call second Constructor in BIKE class
        Bike bike1 = new Bike("long","Diesel",4,4,40,"LED");
        //print 1way
        System.out.println("Handle: " + bike.getHandle());
        System.out.println("Engine type: " + bike.getEngine());
        System.out.println("Number of Seats: " +bike.getSeats());
        System.out.println("Number of Wheels: " +bike.getWheels());
        System.out.println("FuelTank capacity: " +bike.getFuelTank());
        System.out.println("Head Lamp type: " +bike.getLights());
        //pring 2way : using toString
        System.out.println(bike1.toString());

        //calling Bike class run method
        bike1.run();
    }
}
