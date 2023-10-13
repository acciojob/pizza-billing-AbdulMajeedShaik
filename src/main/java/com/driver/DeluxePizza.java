package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese(); // Deluxe pizza comes with extra cheese by default
        addExtraToppings(); // Deluxe pizza comes with extra toppings by default
    }
}