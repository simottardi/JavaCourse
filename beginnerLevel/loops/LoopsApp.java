package beginnerLevel.loops;

public class LoopsApp {
    public static void main(String[] args) {

        int i = 1;
        while(i <= 5){
            System.out.println(i+". BEING RIGHT SUCKS");
            i++;
        }
        System.out.println("Value of i:" + i);
        System.out.println();

        int j = 1;
        do {
            System.out.println(j+". BEING RIGHT SUCKS");
            j++;
        }while (j <=5);
        System.out.println("Value of i:" + j);
        System.out.println();


        for (int k = 1; k<=5; k++){
            if (k == 3){
                break;
                //you can substitute this for continue and it will skip the step currently on
            }
            System.out.println(k + ". BEING RIGHT SUCKS.");
        }
        System.out.println();

        for (int k = 0; k <=5 ; k++) {
            for (int l = 0; l <=2 ; l++) {
                System.out.println("k="+k + " l=" + l + ". BEING RIGHT SUCKS.");
            }

        }
    }
}
