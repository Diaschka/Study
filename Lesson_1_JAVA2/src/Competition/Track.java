package Competition;

public class Track implements Target {
    int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void execute(CompetitionTask competitionTask) {
        competitionTask.run(distance);
    }
}
