package Competition;

public class Wall implements Target{
    double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void execute(CompetitionTask competitionTask) {
        competitionTask.jump(height);
    }
}
