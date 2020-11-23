package ThirdLevelClass;

import secondLevelClass.Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        eggType ="Hard Shelled";
    }

    public Crocodile(float height, float weight, String animalType, String bloodType, String skin, boolean backBorn, String eggType) {
        super(height, weight, animalType, bloodType, skin, backBorn, eggType);
    }


}
