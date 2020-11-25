package Tutorial23;

import Tutorial22.Tutorial22_Archer;

public class Tutorial23_Main {

    public static void main(String[] args) {

        Tutorial23_Hero[] heroes = new Tutorial23_Hero[3];
        /**
         * Concept : Polymorphism - Constuctor
         */
        heroes[0] = new Tutorial23_Warrior("Warrior");
        heroes[1] = new Tutorial23_Archer("Archer");
        heroes[2] = new Tutorial23_Wizard("Wizard");

        for (int i =0; i<3; i++){
            //attack method in Parent Class
            heroes[i].attack();
            /**
             * instanceof Object : Object가 같은 object형태인 맞는지 물어보는 함수
             */
            if(heroes[i] instanceof Tutorial23_Warrior){
                //cating 을 해주는 이유 : 원래 Heroes의 형은 Hero class
               Tutorial23_Warrior temp = (Tutorial23_Warrior) heroes[i];
                System.out.println("I am " + temp.getName());
               temp.groundCutting();
            }else if (heroes[i] instanceof Tutorial23_Archer){
                Tutorial23_Archer temp = (Tutorial23_Archer) heroes[i];
                System.out.println("I am " + temp.getName());
                temp.fireArrow();
            }else if (heroes[i] instanceof Tutorial23_Wizard){
                Tutorial23_Wizard temp = (Tutorial23_Wizard) heroes[i];
                System.out.println("I am " + temp.getName());
                temp.freezing();

            }

            /**
             * output
             * feat!!!!
             * I am Warrior
             * Ground Cutting !!!
             * feat!!!!
             * I am Archer
             * Shot the Fire Arrow!!
             * feat!!!!
             * I am Wizard
             * Freezing !!
             */
        }

    }

}
