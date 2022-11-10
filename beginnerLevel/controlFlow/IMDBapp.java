package beginnerLevel.controlFlow;

public class IMDBapp {

    public static void main(String[] args) {
        String actorName = "Keanu Reeves";
        int yearOfBorn = 1964;

        String[] movieTitles = {
                "The Matrix", "The Matrix Reloaded", "The Matrix revolution"
        };

        Float[] movieRatings = {
                8.7F, 7.2F, 6.8F
        };

        int age = 2022 - yearOfBorn;

                System.out.println("Actor: " + actorName);
        System.out.println("Actor was born in" + yearOfBorn + ". They are now " + age + " years old.");

        for (String movieTitle : movieTitles) {
            System.out.println(movieTitle);
        }

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(i + ". " + movieTitles[1] + " " + movieRatings[i] + " " + getRating(movieRatings[i]))  ;
        }

    }
    static String getRating(float rating) {
        if (rating <= 5.0) {
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
            return "average";
        } else if (rating > 6.5 && rating <= 7.0) {
            return "good";
        } else if (rating > 7.0 && rating <= 8.0) {
            return "very good";
        } else {
            return "amazing";
        }
    }
}


        /*chose actor
        take a mov
        create variables:
        - name
        - year of born
        - array of movie titles and rating
        Print out name of pers
        Print out year of born and age
        Print our movie titles
        Funtcions for
            ratings
            bad rating<=5
            average rating>5 && rating <= 6.5
            good rating > 6.5 && rating <= 7.0
            very good rating > 7.0 && rating <= 8.0
            amazing > 8

         Add the function resul to the title of the movie
         */






