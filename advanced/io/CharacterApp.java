package advanced.io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharacterApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to World of Warlords");
        System.out.println("Here you can crete your character: ");

        System.out.println("Name: ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orc): ");
        while(!userInput.hasNext("human") && !userInput.hasNext("orc")){
            System.err.println("Invalid input, you need to type in human or orc.");
            userInput.nextLine();
        }
        String race = userInput.next();

        System.out.println("Difficulty (0-easy, 1, medium, 2 hard): ");
        while(!userInput.hasNextByte(3) && !userInput.hasNext("orc")){
            System.err.println("Invalid input, you need to type in 0 or 1 or 2.");
            userInput.nextLine();
        }
        byte difficulty = userInput.nextByte();

        System.out.println("Nightmare mode is on (true or false:): ");
        while(!userInput.hasNextBoolean()){
            System.err.println("Invalid input, you need to type in ture or false");
            userInput.nextLine();
        }
        boolean isNightmareModeOn = userInput.nextBoolean();

        System.out.println(("------------------------"));
        System.out.println("Your character is created: ");
        System.out.printf("Name: \t%s\n", name);
        System.out.printf("Race: \t\t%s\n", race);
        System.out.printf("difficulty: %d\n", difficulty);
        System.out.printf("Is Nightmare Mode on: %b\n", isNightmareModeOn);
    }
}
