package exams.robbery2;

import intermediate.thegreatrobbery.Detective;
import intermediate.thegreatrobbery.Item;

import java.util.Random;

public class Police {

    private Detective adamPalmer;
    private Random randomNumberGenerator = new Random();


    public Police(){
        intermediate.thegreatrobbery.Item[] adamItems = new intermediate.thegreatrobbery.Item[2];
        adamItems[0] = new intermediate.thegreatrobbery.Item("Revolver", 500.0);
        adamItems[1] = new Item("Magnifying glass", 10.0);
        adamPalmer = new Detective("Adam Palmer", "Coyote", 1960, "chess", adamItems);
    }

    public boolean areCriminalsCaught(){
        int randomNumber = randomNumberGenerator.nextInt(101);
        if (randomNumber >= adamPalmer.SUCCESS_PERCENTAGE ){
            return false;
        }else{
        return true;
        }
    }

    public Boolean catchCriminals(Gang gang){
        if(areCriminalsCaught() == true){
            System.out.println(adamPalmer.getName() + " managed to catch the gang");
            if(gang.getSumRobbedValue() > 0){
                System.out.println("The stolen items are recovered.");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            }else{
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        }else{
            System.out.println(adamPalmer.getName() + " couldn't catch the criminals.");
            System.out.println("They managed to steal items valued $" + gang.getSumRobbedValue());
            return false;
        }

    }


}
