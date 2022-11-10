package beginnerLevel;

public class DarkConfidantVariables {
    public static void main(String[] args) {
        String cardName = "Dark confidant";
        String cardType = "Creature - Human wizard";
        String cardDescription = "At the beginning of your upkeep, reveal the top card of your library and put that card into your hand. You lose life equal to its mana value.";
        String flavour = "Greatness, at any cost.";
        byte power = 2;
        byte thoughness = 1;
        boolean legalInModern = true;
        boolean legalInLegacy = true;
        boolean legalInPauper = false;

        System.out.println(cardName);
        System.out.println(cardType);
        System.out.println(cardDescription);
        System.out.println(flavour);
        System.out.println("Power: " + power );
        System.out.println("Thoughness: " + thoughness);
        System.out.println("Legal in pauper: " + legalInPauper);
        System.out.println("Legal in legacy: " + legalInLegacy);
    }

}
