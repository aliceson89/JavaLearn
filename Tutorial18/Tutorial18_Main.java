package Tutorial18;

public class Tutorial18_Main extends Tutorial18_Player{

    public static void main (String arg[]){

        Tutorial18_Main main = new Tutorial18_Main();
        main.play("abcd - Love");
        main.pause();
        main.stop();

        Tutorial18_Dog dog =new Tutorial18_Dog();
        Tutorial18_Cat cat = new Tutorial18_Cat();
        dog.crying();
        cat.crying();

    }

    @Override
    void play(String songName) {
        System.out.println("Play " +songName );
    }

    @Override
    void pause() {
        System.out.println("Pause");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }


}
