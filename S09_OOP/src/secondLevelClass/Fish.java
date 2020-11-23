package secondLevelClass;

import FirstLevelClass.Animal;

public class Fish extends Animal {

    protected boolean liveWater;
    protected boolean hasGills;

    public Fish() {
        super();
        this.liveWater = true;
        this.hasGills = true;
    }

    public Fish(float height, float weight, String animalType, String bloodType, boolean liveWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveWater = liveWater;
        this.hasGills = hasGills;
    }

    public boolean isLiveWater() {
        return liveWater;
    }

    public boolean isHasGills() {
        return hasGills;
    }


    public String showInfo() {
        return "Fish{" +
                "liveWater=" + liveWater +
                ", hasGills=" + hasGills +
                "} " + super.showInfo();
    }
}
