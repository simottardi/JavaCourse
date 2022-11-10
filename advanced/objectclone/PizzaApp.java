package advanced.objectclone;

public class PizzaApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza pizzaOrder = new Pizza("Margherita", PizzaSize.MEDIUM);
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        ;
        System.out.println();

        System.out.println("I ordered a pizza:");
        System.out.println("Name " + pizzaOrder.getName());
        System.out.println("Size " + pizzaOrder.getPizzaSize().name());
        System.out.println("Price $" + pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered a pizza:");
        System.out.println("Name " + samePizza.getName());
        System.out.println("Size " + samePizza.getPizzaSize().name());
        System.out.println("Price $" + samePizza.getPrice());

        System.out.println(pizzaOrder.equals(samePizza));
        System.out.println(pizzaOrder.equals(pizzaOrder));

        Pizza anotherPizza = new Pizza("Margherita", PizzaSize.LARGE);
        System.out.println(pizzaOrder.equals(samePizza));

        System.out.println("-----------------------");
        //System.out.println((anotherPizza.getClass().getSimpleName));


        System.out.println("---------------------------------");
   /*     System.out.println(anotherPizza.getClass().getSimpleName());
        System.out.println(anotherPizza.getClass().getName());
        System.out.println(Arrays.toString(anotherPizza.getClass().getFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getMethods()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredMethods()));
        System.out.println(anotherPizza.getClass().getSuperclass());*/

        System.out.println("---------------------------------");
        System.out.println("pizzaOrder's hashcode: " + pizzaOrder.hashCode());
        System.out.println("samePizza's hashcode: " + samePizza.hashCode());
        System.out.println("anotherPizza's hashcode: " + anotherPizza.hashCode());
    }
}
