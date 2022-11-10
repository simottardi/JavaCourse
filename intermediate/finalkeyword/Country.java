package intermediate.finalkeyword;

public  class Country {
    private final String NAME ;
    private int population;
    private String capital;


    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
    }

    public final void populationChange (int change){
        population += change;
    }

    //If we write the setter below we would see an error that is because the name cannot be changed, the only way to change the name is to change the argument passed to the constructor
    /*public void setNAME(String name){
        NAME = name;

    }
     */
}
