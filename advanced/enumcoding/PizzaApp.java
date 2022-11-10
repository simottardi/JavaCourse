package advanced.enumcoding;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza pizzaOrder = new Pizza("Margherita", PizzaSize.MEDIUM);
        for (PizzaSize pizzaSize : PizzaSize.values()){
                System.out.println("- "+ pizzaSize.getPizzaSizeText());
        };
            System.out.println();

        System.out.println("I ordered a pizza:");
        System.out.println("Name " + pizzaOrder.getName());
        System.out.println("Size " + pizzaOrder.getPizzaSize().name());
        System.out.println("Price $" + pizzaOrder.getPrice());
    }
}
