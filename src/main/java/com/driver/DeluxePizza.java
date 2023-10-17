package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);

        // Add extra cheese and toppings by default
        this.addExtraCheese();
        this.addExtraToppings();
    }
}
