package intermediate.inheritance.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)1, (short) 392, (short)492,(short) 23, (short) 123 ,32432,true);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is EUR" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(3500);
        System.out.println(redDodgeChallenger.getCarName() + "'s new price is EUR" + redDodgeChallenger.getPrice());
        redDodgeChallenger.startTheEngine();
        System.out.println("Entering city");
        redDodgeChallenger.startTheElectricEngine();
        //dodgeChallenger.gerDescription();
        System.out.println("The car has" + redDodgeChallenger.getMileage() + "miles");
        redDodgeChallenger.drive(100);
        System.out.println("After driving the car, it has " + redDodgeChallenger.getMileage() + "miles");

        System.out.println("-----------------------------------------");

        DodgeChallenger anotherDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392, (short)492,(short) 23, (short) 123 ,2323,true );
        anotherDodgeChallenger.startTheEngine();
        // anotherDodgeChallenger.mileage = 0;
        anotherDodgeChallenger.gerDescription();

        System.out.println("-----------------------------------------");
        ToyotaSupra toyotaSupra = new ToyotaSupra("purple", (byte)1, (short) 345, (short)42,(short) 2343, (short) 13423 ,232343,false );
        toyotaSupra.startTheEngine();

    }
}
