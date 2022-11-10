package intermediate.statickeyword;

public  class Country {

    private static int numberOfCountries;
    private final String NAME ;
    private int population;
    private String capital;

    static{
        numberOfCountries = 5;
    }

// overrides previous block
    static{
        numberOfCountries = 5;
    }

    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public final void populationChange (int change){
        population += change;
    }

    public  void getDetails() {
        System.out.println("Country name: "+ NAME + "Population: "+ population + " Capital: " + capital);
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }

    //If we write the setter below we would see an error that is because the name cannot be changed, the only way to change the name is to change the argument passed to the constructor
    /*public void setNAME(String name){
        NAME = name;

    }
     */
}
