package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {

    @Test
    public void testVegPizzaWithExtrasAndTakeaway() {
        Pizza vegPizza = new Pizza(true);
        vegPizza.addExtraCheese();
        vegPizza.addExtraToppings();
        vegPizza.addTakeaway();
        String expectedBill = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 70\nPaperbag Added: 20\nTotal Price: 470";
        assertEquals(expectedBill, vegPizza.getBill());
    }

    @Test
    public void testNonVegDeluxePizzaWithTakeaway() {
        DeluxePizza deluxePizza = new DeluxePizza(false);
        String actualBill = deluxePizza.getBill();
        System.out.println("Actual Bill: " + actualBill);
        String expectedBill = "Base Price Of The Pizza: 400\nPaperbag Added: 20\nTotal Price: 420";

    }

}

