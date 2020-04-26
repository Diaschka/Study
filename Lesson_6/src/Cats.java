public class Cats extends Animals {

    public Cats(){
        super(0,200,0,0,0,2);
    }

    @Override
    public void Swim(double swimDistance){
        System.out.println("Cats can't swim.");
    }
}
