package car;

public class Car {

    //object property = object status
    //recommendation: behavior can access property using function (getter and setter)
    //                or we can set property with "public" not "private"
    //NOTE : should initialize all properties to avoid NULL pointer exception
    //way 1 : directly set the value
    /*private String doors = "opend";
    private String engine = "off";
    private String driver = "absent";
    private int speed = 0;*/

    private String doors;
    private String engine;
    private String driver;
    private int speed;

    //way 2 : use constructor
    public Car(){
        doors= "opend";
        engine = "off";
        driver = "absent";
        speed = 0;
    }

    // using autogenerator : command + N
    // **constructor 가 있으면 setter 없어도 property 를 initialize 할 수 있다.
    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    //getter and setter short cut : command +N
    public void setSpeed(int speed){
        //this means globla variable in Car Class
        //여기서는 private int speed 라고 볼 수 있다.
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String run(){

        if (doors.equals("closed") && (engine.equals("on")) && (driver.equals("seated")) && speed >0){
            return "running";
        }
        else return "not running";
    }
}
