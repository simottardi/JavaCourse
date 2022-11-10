package intermediate.classesandobjects;

import java.util.Random;

public class MagicCards {

    String cardName;
    String cardType;
    String cardDescription;
    String flavour;
    byte power;
    byte thoughness;
    boolean legalInModern;
    boolean legalInLegacy;
    boolean legalInPauper;

    public MagicCards(String cardName, String cardType, String cardDescription, String flavour, byte power, byte thoughness, boolean legalInModern, boolean legalInLegacy, boolean legalInPauper) {
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardDescription = cardDescription;
        this.flavour = flavour;
        this.power = power;
        this.thoughness = thoughness;
        this.legalInModern = legalInModern;
        this.legalInLegacy = legalInLegacy;
        this.legalInPauper = legalInPauper;
    }

    public void attack() {
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble() * 100) > 50) {
            System.out.println(cardName + " does not attack");
        } else {
            System.out.println(cardName + " attacks");
        }
    }
}
