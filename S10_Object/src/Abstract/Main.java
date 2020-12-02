package Abstract;

public class Main {
    public static void main (String args []){

        Person john = new Vegan();
        john.speak();
        //output
        //Shares his/her thoughts

        john.eat();
        //output
        //Eats vegan food

        Person mia = new NonVegan();
        mia.speak();
        //output
        //Shares his/her thoughts
        mia.eat();
        //output
        //Eats non vegan food

        //from interface
        john.breathe();
        //output
        //Be alive
        john.message();
        //output
        //Life is journey, Keep moving and meet new people
    }
}
