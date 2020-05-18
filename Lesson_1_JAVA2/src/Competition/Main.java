package Competition;

public class Main {
    public static void main(String[] args) {
        CompetitionTask[] competitors = {
                new Human("Napoleom",2.1,1300),
                new Cat("Sausage",1.3,450),
                new Cat("Smoky",0.7,1100),
                new Robot("Verter",0.5,700),

        };

        Target[] targets = {
                new Track(1000),
                new Wall(1.1),
        };

        for (CompetitionTask competitor: competitors) {
            competitor.information();
        }

        for (CompetitionTask competitor: competitors) {
            for (Target target: targets) {
                target.execute(competitor);
                if(!competitor.isOnDistance()){
                    break;
                }
            }
        }


    }


}
