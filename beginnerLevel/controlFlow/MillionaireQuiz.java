package beginnerLevel.controlFlow;

public class MillionaireQuiz {
/*
    define var
    print out questions
    print answers
    use control flow
*/
    public static void main(String[] args) {

        char answer = 'C';

        System.out.println("Who was the inventor of the lightbulb");
        System.out.println("A. Nikola tesla");
        System.out.println("B. Marie Curie");
        System.out.println("C. Thomas Edison");
        System.out.println("D. Robert Oppenheimer");
        System.out.println();
        System.out.println("My answer is " + answer + ".");
        System.out.println();

        if (answer == 'C'){
            System.out.println("Your answer is correct.");
        } else {
            System.out.println("Sorry, your answer is not correct.");
        }

    }
}
