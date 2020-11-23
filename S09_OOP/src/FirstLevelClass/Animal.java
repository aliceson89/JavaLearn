package FirstLevelClass;

public class Animal {
    protected float height;
    protected float weight;
    protected String animalType;
    protected String bloodType;

    public Animal (){
        this.height =0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";

    }
    public Animal(float height, float weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }


    public String showInfo() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", AnimalType='" + animalType + '\'' +
                ", BloodType='" + bloodType + '\'' +
                '}';
    }
}
