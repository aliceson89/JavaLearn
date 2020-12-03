package Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int VehicleId;

    public Vehicle(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "VehicleId=" + VehicleId +
                '}';
    }

    void info(){
        System.out.println("vehicle ID is : " + getVehicleId());
    }
}

class Car extends Vehicle{

    private String CarModel;

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        CarModel = carModel;
    }

    public String getCarModel() {
        return CarModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel='" + CarModel + '\'' +
                "} " + super.toString();
    }
    @Override
    void info(){
        System.out.println("Car Model is : " + getCarModel());
    }
}
public class App6 {
    public static void main (String[] args){
        List<Object> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(14,"A14"));
        list.add(new String("String Object"));
        // we can use this method directly because this is static method : 객체의 생성없이 호출이 가능함.
        display(list);
        /**
         * Vehicles{VehicleId=10}
         * Vehicles{VehicleId=11}
         * Vehicles{VehicleId=12}
         * Vehicles{VehicleId=13}
         * Car{CarModel='A14'} Vehicles{VehicleId=14}
         * String Object
         */

        List<Vehicle> list2 = new ArrayList<>();
        list2.add(new Vehicle(10));
        list2.add(new Vehicle(11));
        list2.add(new Vehicle(12));
        list2.add(new Vehicle(13));
        list2.add(new Car(14,"A14"));
        display2(list2);
        /**
         * vehicle ID is : 10
         * vehicle ID is : 11
         * vehicle ID is : 12
         * vehicle ID is : 13
         * Car Model is : A14
         */

        List<Vehicle> list3 = new ArrayList<>();
        list3.add(new Vehicle(10));
        list3.add(new Vehicle(11));
        list3.add(new Vehicle(12));
        list3.add(new Vehicle(13));
        list3.add(new Car(14,"A14"));

    }

    /**
     * when we don't know which type of object in the List use wildcard *
     */
    public static void display(List<?> list){
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // bounded only Vehicle object and it's child class (Car)
    // Vehicle is upper limitation
    public static void display2(List<? extends Vehicle> list){
        for (Vehicle element : list) {
            //polymorphism - dynamically picked up the correct object when the method is called.
            element.info();
        }
    }

    //lower bound with "super child Class"
    public static void display3(List<? super Car> list){
        for (Object element : list) {
            System.out.println(element);
            /**
             * cannot call info() method with lower bound because element is Object Class
             * element.info();
             */

        }
    }


}
