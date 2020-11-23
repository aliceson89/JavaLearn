package ThirdLevelClass;

import secondLevelClass.Fish;

public class Eel extends Fish {

    private String trait;

    public Eel() {
        super();
        this.trait = "release electric charge";
    }

    public Eel(float height, float weight, String animalType, String bloodType, boolean liveWater, boolean hasGills, String trait) {
        super(height, weight, animalType, bloodType, liveWater, hasGills);
        this.trait = trait;
    }


    public String getTrait() {
        return trait;
    }

    public String showInfo() {
        return "Eel{" +
                "trait='" + trait + '\'' +
                "} " + super.showInfo();
    }
}
