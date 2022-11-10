package advanced.objecttostring;

public enum PizzaSize {
    SMALL("Small size"),
    MEDIUM("Medium size"),
    LARGE( "Large size");

    private final String pizzaSizetext;


    PizzaSize(String pizzaSizeText){
        this.pizzaSizetext = pizzaSizeText;
    }

    public String getPizzaSizeText(){
        return pizzaSizetext;
    }
}
