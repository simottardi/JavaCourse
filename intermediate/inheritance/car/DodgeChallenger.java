package intermediate.inheritance.car;

public class DodgeChallenger extends Car implements ElectricMode{

    public DodgeChallenger( String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                           int price, int mileage, boolean isDamaged){
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A dodge challenger has started the engine");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("Dodge Challenger starts its electric engine");
    }
}
