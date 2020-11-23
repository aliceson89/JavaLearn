package ThirdLevelClass;

import secondLevelClass.Birds;

public class Eagle extends Birds {
    public Eagle() {
        super();
    }

    public Eagle(float height, float weight, String animalType, String bloodType, boolean feather, boolean canFly) {
        super(height, weight, animalType, bloodType, feather, canFly);
    }

}
