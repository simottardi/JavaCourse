package beginnerLevel.controlFlow;

public class MethodsPracticeApp {

    public static void main(String[] args) {
    carDescription( "tesla", 2018, "good");
    carEfficiency('C');
    }

    /* two methods
    1 return energy consumuption level, mek it compatible with A and a with char values
    2 retun car description

    String model
    int productionYear
    String condition
     */

    static void carDescription ( String model, int productionYear,  String condition){
        System.out.println("Model: " + model);
        System.out.println("Priduction year: " + productionYear);
        System.out.println("Conditions: " + condition);
    }

    static void carEfficiency ( char efficiencyRating){


    String efficiencyRatingString;
        switch (efficiencyRating) {
            case 'a':
            case 'A':
                efficiencyRatingString = "very low";
                break;

            case 'b':
            case 'B':
                efficiencyRatingString = "low";
                break;
            default: efficiencyRatingString = "unknown";
                break;
        }
        System.out.println("The car effiency rating is: " + efficiencyRatingString + ".");
    }




}
