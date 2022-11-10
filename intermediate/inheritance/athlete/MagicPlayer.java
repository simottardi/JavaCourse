package intermediate.inheritance.athlete;

import java.util.Random;

public class MagicPlayer extends Athlete implements PlayCard{

    private String tournaments;
    private String favoriteCard;
    String name;

    public MagicPlayer(String name, String nickname, int yearOfBorn, String team, int gamesPlayed, String tournaments,String favoriteCard) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.tournaments= tournaments;
        this.favoriteCard = favoriteCard;
    }

    public void playCard(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > 0.5){
            System.out.println( "Player played:" + favoriteCard);
        }else{
            System.out.println("scored free throw" + favoriteCard);
        }
    }



    @Override
    public void playCard(String cardName) {
        System.out.println("Player plays " + cardName);
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Tournaments:" + tournaments);
        System.out.println("Favorite card:" + favoriteCard);
    }

    @Override
    public String getBodyType() {
        return "irrelevant";
    }

    public void setFavoriteCard(String favoriteCard) {
        this.favoriteCard = favoriteCard;
    }

    public String getFavoriteCard() {
        return favoriteCard;
    }

    public String getName(){
        return this.name;
    }



    @Override
    public void compete() {
        super.compete();
        playCard();
    }


}
