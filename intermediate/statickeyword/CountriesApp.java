package intermediate.statickeyword;

public class CountriesApp {

    public static void main(String[] args) {
        System.out.println("number of countries: " + Country.getNumberOfCountries());

        Country brazil = new Country("brazil", 210000000, "Brasilia");
        brazil.getDetails();
        Country germany = new Country("germany", 83000000, "Berlin");
        germany.getDetails();
        Country japan = new Country("japan", 12500000, "Tokyo");
        japan.getDetails();
        System.out.println("number of countries: " + Country.getNumberOfCountries());
    }
}
