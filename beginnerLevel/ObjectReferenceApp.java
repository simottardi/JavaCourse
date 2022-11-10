package beginnerLevel;

import intermediate.inheritance.car.DodgeChallenger;

public class ObjectReferenceApp {

    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 122334456564L;

        Float fuelConsumptuion  = 15.5F;
        Double exactFuelConsumption = 15.34245647;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'C';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String ("DodgeChallenger SRT 392");


        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Price: " + registrationNumber);
        System.out.println("Combined fuel consumption:" +fuelConsumptuion);
    }

    DodgeChallenger anotherDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392, (short)492,(short) 23, (short) 123 ,22232,true );

}
