package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;

    // Constants for pricing
    private static final int VEG_BASE_PRICE = 300;
    private static final int NON_VEG_BASE_PRICE = 400;
    private static final int EXTRA_CHEESE_PRICE = 80;
    private static final int VEG_EXTRA_TOPPINGS_PRICE = 70;
    private static final int NON_VEG_EXTRA_TOPPINGS_PRICE = 120;
    private static final int PAPER_BAG_PRICE = 20;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE;
        this.bill = "Base Price Of The Pizza: " + this.price;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!bill.contains("Extra Cheese Added")) {
            this.price += EXTRA_CHEESE_PRICE;
            this.bill += "\nExtra Cheese Added: " + EXTRA_CHEESE_PRICE;
        }
    }

    public void addExtraToppings() {
        if (isVeg && !bill.contains("Extra Toppings Added")) {
            this.price += VEG_EXTRA_TOPPINGS_PRICE;
            this.bill += "\nExtra Toppings Added: " + VEG_EXTRA_TOPPINGS_PRICE;
        } else if (!isVeg && !bill.contains("Extra Toppings Added")) {
            this.price += NON_VEG_EXTRA_TOPPINGS_PRICE;
            this.bill += "\nExtra Toppings Added: " + NON_VEG_EXTRA_TOPPINGS_PRICE;
        }
    }

    public void addTakeaway() {
        if (!bill.contains("Paperbag Added")) {
            this.price += PAPER_BAG_PRICE;
            this.bill += "\nPaperbag Added: " + PAPER_BAG_PRICE;
        }
    }

    public String getBill() {
        // Append the Total Price only once
        this.bill += "\nTotal Price: " + this.price;
        return this.bill;
    }
}
