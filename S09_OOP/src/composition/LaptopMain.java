package composition;

import composition.GraphicsCard;
import composition.Laptop;
import composition.Processor;

public class LaptopMain {

    public static void main (String[] args){
        Laptop lap1 = new Laptop();
        System.out.println(lap1);
        // to get the value from Processor object, should use getter.
        System.out.println(lap1.getProcessor().getBrand());

        //way 1
        Processor processor = new Processor("intel", "7200u",7,4,4,"6 MB","2.5Ghz","2.5Ghz","3.1Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia",1050,"4 GB");
        Laptop gamingLaptop1 = new Laptop(17,processor, "DDR4", "2 TB",graphicsCard, null, "backlit");
        System.out.println(gamingLaptop1.toString());

        //way 2
        Laptop gamingLaptop2 = new Laptop(17,new Processor("intel", "7200u",7,4,4,"6 MB","2.5Ghz","2.5Ghz","3.1Ghz"), "DDR4", "2 TB",new GraphicsCard("Nvidia",1050,"4 GB"), null, "backlit");
        System.out.println(gamingLaptop2.toString());
        gamingLaptop1.gamingMode();
        System.out.println("Gaming mode on");
        System.out.println("Current Frequency : "+ gamingLaptop1.getProcessor().getFrequency());

    }
}
