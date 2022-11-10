package intermediate.inheritance.athlete;

public class FootballPlayer extends Athlete{
    private int complitions;
    private int passingYards;
    public FootballPlayer(String name, String nickname, int yearOfBorn, String team, int gamesPlayed, int  complitions, int passingYards) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.complitions = complitions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("complitions: " + complitions);
        System.out.println("passing yards: " +  passingYards);
    }

    @Override
    public String getBodyType() {
        return "Big muscles and great endurance";
    }

    public void increaseCompletions(int Complitions){
        this.complitions += complitions;
    }

    public void increasePassingYards(int passingYards){
        this.passingYards += passingYards;
    }
}
