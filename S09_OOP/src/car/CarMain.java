package car;


public class CarMain {

    public static void main (String[] args){

        //crate object named car
        //Car car = new Car();
        //initialize manually
        /*car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("on");*/

        //Create the class and Initialize the property
        Car car = new Car("closed", "on", "seated", 10);

        //way1 : we can access "speed" property when we set speed property as "public"
        //car.speed = 1;

        //way2 : using getter and setter method
        car.setSpeed(10);
        System.out.println(car.getSpeed());
        //output :10

        //calling run method
        System.out.println(car.run());
        //output : running


    }
}
