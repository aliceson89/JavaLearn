package Tutorial23;

public class Tutorial23_Wizard extends Tutorial23_Hero{
    public Tutorial23_Wizard(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public void freezing (){
        System.out.println("Freezing !!");
    }
}
