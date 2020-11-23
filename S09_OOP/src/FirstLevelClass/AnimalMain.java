package FirstLevelClass;
import ThirdLevelClass.*;
import secondLevelClass.Reptile;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {


    public static void main (String[] args){
        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());
        //output : Reptile{skin=Dry Skin, backBorn=true, eggType='soft-shelled'} Animal{height=5.0, weight=20.0, AnimalType='Reptile', BloodType='Cold'}
        Crocodile crocodile = new Crocodile();

        System.out.println(crocodile.showInfo());
        //output : Reptile{skin=Dry Skin, backBorn=true, eggType='Hard Shelled'} Animal{height=5.0, weight=20.0, AnimalType='Reptile', BloodType='Cold'}

        Eel eel = new Eel();
        System.out.println(eel.showInfo());
        //output : Eel{trait='release electric charge'} Fish{liveWater=true, hasGills=true} Animal{height=0.0, weight=0.0, AnimalType='unknown', BloodType='unknown'}
        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
        //output : Birds{feather='true', canFly=true} Animal{height=0.0, weight=0.0, AnimalType='unknown', BloodType='unknown'}


        //Polymorphism
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Animal reptile1 = new Reptile();
        Animal croc = new Crocodile();
        Animal eel1 = new Eel();
        Animal eagle1 = new Eagle();

        animals.add(animal);
        animals.add(reptile1);
        animals.add(croc);
        animals.add(eel1);
        animals.add(eagle1);
        listAnimals(animals);

        //output :
        /*
        * Animal{height=0.0, weight=0.0, AnimalType='unknown', BloodType='unknown'}
        * Reptile{skin=Dry Skin, backBorn=true, eggType='soft-shelled'} Animal{height=5.0, weight=20.0, AnimalType='Reptile', BloodType='Cold'}
        * Crocodile 의 경우 showInfo method 가 없어서 대신 retile 오브젝트의 showInfo method 를 calling 함
        * * Reptile{skin=Dry Skin, backBorn=true, eggType='Hard Shelled'} Animal{height=5.0, weight=20.0, AnimalType='Reptile', BloodType='Cold'}
        * Eel{trait='release electric charge'} Fish{liveWater=true, hasGills=true} Animal{height=0.0, weight=0.0, AnimalType='unknown', BloodType='unknown'}
        * Birds{feather='true', canFly=true} Animal{height=0.0, weight=0.0, AnimalType='unknown', BloodType='unknown'}*/

    }

    public static void listAnimals(List<Animal> animals){
        for (Animal animal: animals){
            System.out.println(animal.showInfo());
        }
    }
}
