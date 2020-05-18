package Competition;

public class Human implements CompetitionTask {
    private String competitor;
    private String name;
    private double maxHeight;
    private int maxDistance;
    private boolean onDistance = true;

    @Override
    public void information() {
        System.out.println(competitor+" "+name+" can run and jump.");
    }

    public Human(String name, double maxHeight, int maxDistance) {
        this.competitor = "Human";
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run (int distance) {
        if(distance <= maxDistance){
            System.out.println(competitor+" "+name+" successfully ran "+distance+" meters distance.");
        } else{
            System.out.println(competitor+" "+name+" is not able to run the "+distance+" meters distance. This competitor is OUT.");
            onDistance = false;
        }
    }

    @Override
    public void jump(double height) {
        if(height <= maxHeight){
            System.out.println(competitor+" "+name+" successfully jumped over "+height+"meters barrier.");
        } else{
            System.out.println(competitor+" "+name+" is not able to jump over the "+height+" meters barrier. This competitor is OUT.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
