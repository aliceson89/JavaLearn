package secondLevelClass;

import FirstLevelClass.Animal;

public class Reptile extends Animal {

    protected String skin;
    protected boolean backBorn;
    protected String eggType;

    public Reptile() {
        super(5,20,"Reptile","Cold");
        this.skin="Dry Skin";
        this.backBorn=true;
        this.eggType = "soft-shelled";
    }

    public Reptile(float height, float weight, String animalType, String bloodType, String skin, boolean backBorn, String eggType) {
        super(height, weight, animalType, bloodType);
        this.skin = skin;
        this.backBorn = backBorn;
        this.eggType = eggType;
    }

    public String isSkin() {
        return skin;
    }

    public boolean isBackBorn() {
        return backBorn;
    }

    public String getEggType() {
        return eggType;
    }


    public String showInfo() {
        return "Reptile{" +
                "skin=" + skin +
                ", backBorn=" + backBorn +
                ", eggType='" + eggType + '\'' +
                "} " + super.showInfo();
    }
}
