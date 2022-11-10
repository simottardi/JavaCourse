package advanced.innerclasses.staticnested;

import advanced.enumcoding.PizzaSize;

public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private boolean isExtraTomatoSauce;
    private boolean isSalad;

    private Pizza(Builder builder){
        this.name =builder.name;
        this.pizzaSize = builder.pizzaSize;
        this.isExtraTomatoSauce = builder.isExtraTomatoSauce;
        this.isSalad= builder.isSalad;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean isExtraTomatoSauce() {
        return isExtraTomatoSauce;
    }

    public boolean isSalad() {
        return isSalad;
    }

    public static class Builder {
        private String name;
        private PizzaSize pizzaSize;
        private boolean isExtraTomatoSauce;
        private boolean isSalad;

        Builder (String name, PizzaSize pizzaSize ){
            this.name =name;
            this.pizzaSize = pizzaSize;
        }
        // upper part of this code is the builder
        // lower part of the code are functions

        public Builder withExtraTomatoSauce(boolean isExtraTomatoSauce){
            this.isExtraTomatoSauce = isExtraTomatoSauce;
            return this;
        }

        public Builder withSalad (boolean isSalad){
            this.isSalad = isSalad;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
            /*
            the builder returns a builderobjec
            it is possible to use the sintax builderobject.functionName
             to do the above we need to `retun this` at the end of the builder function
             */
    }
}
