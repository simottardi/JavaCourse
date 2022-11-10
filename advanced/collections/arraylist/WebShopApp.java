package advanced.collections.arraylist;

import java.util.ArrayList;

public class WebShopApp {

    public static void main(String[] args) {
        ArrayList<Product>products = new ArrayList<>();

        products.add(new Product("Fidget spinner",3.99,"it's fun" ));
        products.add(new Product("Earbud", 39.99,"amazing sound"));
        products.add(new Product("Earbud", 39.99,"amazing sound"));


        products.add(1, new Product("36 AAA battery", 9.99,"high performance battery"));

        products.remove(2);
        //products.remove(new Product("Earbud", 39.99,"amazing sound"));

        products.set(0, new Product("rubber duck", 5.99, "you cannot have a bath without this"));

        //System.out.println(products);

        for(Product product :products){
            System.out.println(product);
        }

        System.out.println("The third element in the list");
        System.out.println(products.get(2));

        System.out.println(products.size() + " products can be found in the list");


    }
}
