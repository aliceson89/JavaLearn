package phone;

public class Samsung extends Phone{

    public String model;

    public Samsung(String model) {
        super(model);
    }

    public void features(){
        System.out.println("Android flagship");
    }

}
