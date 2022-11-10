package beginnerLevel;

public class Variables {
    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOweners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 909009023232342567L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 12.32434356565e-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory  = 'G';

        System.out.println("2018 dodge Challenger SRT 392");
        System.out.println("Price: "+ price + "EURO");
        System.out.println("Mileage: "+ mileage + "ml");
        System.out.println("The care is damaged: "+ isDamaged);
        System.out.println("Cubic capacity:" + cubicCapacity + "ccm");
        System.out.println("Power:" + power + "KW(" + horsePower + "hp)");
        System.out.println("Co2 emissions:" + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " (Energy efficiency: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption " + fuelConsumptionCombined + "l/100km");
        System.out.println("Extra urban fuel consumption " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Precise average fuel consumption " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOweners + "");
        System.out.println("Number of doors: " + numberOfDoors + "");
        System.out.println("Number of seats: " + numberOfSeats + "");

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("the vlaues of new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW");


        }
}
