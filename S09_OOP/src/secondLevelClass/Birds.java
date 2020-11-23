package secondLevelClass;

import FirstLevelClass.Animal;

public class Birds extends Animal {

    protected boolean feather;
    protected boolean canFly;

    public Birds() {
        super();
        this.feather = true;
        this.canFly = true;
    }

    public Birds(float height, float weight, String animalType, String bloodType, boolean feather, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.feather = feather;
        this.canFly = canFly;
    }

    public boolean getFeather() {
        return feather;
    }

    public boolean isCanFly() {
        return canFly;
    }


    public String showInfo() {
        return "Birds{" +
                "feather='" + feather + '\'' +
                ", canFly=" + canFly +
                "} " + super.showInfo();
    }
}
