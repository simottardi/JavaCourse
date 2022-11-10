package beginnerLevel.controlFlow;

public class ControlFlow {
    public static void main(String[] args) {
        boolean isDamaged =  true;
        String carColor = "black";
        char efficiencyCategory = 'G';

        if(isDamaged){
            System.out.println("Damaged car");
        }else{
            System.out.println("Accident free car");
        }

        if(carColor.equals("red")){
            System.out.println("this car is red");
        }else if(carColor.equals("Green")){
            System.out.println("this car is green");
        }else{
            System.out.println("I have no idea which color is this car");
        }


        switch (efficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
                break;
            case 'G':
                System.out.println("Very high energy consumption");
                break;
            default:
                System.out.println("Not defined category");
        }

        // below is the practice for the code block lecture
        {
            int numberOfOwners = 5;
            {
                numberOfOwners++;
            }
            System.out.println("Number of owners: " + numberOfOwners);
        }
        // variables defined inside of the code blok do not exist after the block is closed

    }
}
