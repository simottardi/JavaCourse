package intermediate.inheritance.athlete;

public class AthleteApp {
    public static void main(String[] args) {
   BasketballPlayer kobe = new BasketballPlayer("Kobe Briant", "Black mamba", 1978, "lakers", (double) 83.7, (double)28, 89);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(35.5);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan", "MG", 1963, "Chicago Bulls", (double) 83.5, (double)30.1, 89);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            System.out.println("-----------------");
            basketballPlayer.compete();
            System.out.println("-----------------");
            basketballPlayer.getBio();
            System.out.println(basketballPlayer.getBodyType());
        }

        FootballPlayer tom =  new FootballPlayer("Tom brady","Tom terrific", 1977, "luo",99, 98, 89   );
        tom.increasePassingYards(18);
        FootballPlayer ed =  new FootballPlayer("ED brady","ED terrific", 1975, "bluo",349, 9348, 3489   );

        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for (FootballPlayer footballPlayer: footballPlayers) {
            System.out.println("-----------------");
            footballPlayer.compete();
            System.out.println("-----------------");
            footballPlayer.getBio();
            System.out.println(footballPlayer.getBodyType());
        }

        Swimmer katinka = new Swimmer( "Katinka Hosszu", "Iron Lady",1989,"iron",274, 234);

        System.out.println("-----------------");
        katinka.compete();
        katinka.freestyle(100);
        katinka.freestyle(200);

        System.out.println("-----------------");
        katinka.getBio();
        System.out.println(katinka.getBodyType());

        MagicPlayer bob =  new MagicPlayer("Robert","Bob", 1971, "luo",  88,"kamigawa","Dark confidant" );
        System.out.println("-----------------");
        bob.getBio();
        bob.playCard();
        bob.getName();
        bob.setFavoriteCard("Swamp");
        bob.getFavoriteCard();
        bob.getBio();
        bob.playCard("Inquisition of kozilek");
    }
}
