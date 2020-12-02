package Abstract;

public abstract class Person implements IsAlive, LiveLife{
    public void speak (){
        System.out.println("Shares his/her thoughts");
    }


    public abstract void eat();

    //brethe 와 message 는 사람이 공통으로 같은 속성이므로 Person에 정의해
    @Override
    public void breathe(){
        System.out.println("Be alive");

    }
    @Override
    public void message(){
        System.out.println("Life is journey, Keep moving and meet new people ");
    }
}
