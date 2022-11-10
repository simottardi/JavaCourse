package intermediate.classesandobjects;

public class MagicCardsApp {
    public static void main(String[] args) {
        MagicCards darkConfidant = new MagicCards("Dark Confidant", "creature", "la lal la", "Greatness, at all costs!", (byte) 2, (byte)1, true, true, false);
        MagicCards swamp = new MagicCards("swamp", "land", "-", "behold the swamp", (byte) 0, (byte)0, true, true, true);


        MagicCards[] magicCards = new MagicCards[2];
        magicCards[0] = darkConfidant;
        magicCards[1] = swamp;

        for (MagicCards magicCard : magicCards) {
            magicCard.attack();
        }
    }
}
