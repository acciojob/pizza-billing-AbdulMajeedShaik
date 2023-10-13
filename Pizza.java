
package com.driver;

public class Pizza {

    private int basePrice;
    private boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean paperBag;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = (isVeg) ? 300 : 400;
        this.extraCheese = false;
        this.extraToppings = false;
        this.paperBag = false;
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            extraCheese = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppings) {
            extraToppings = true;
        }
    }

    public void addTakeaway() {
        if (!paperBag) {
            paperBag = true;
        }
    }

    public int getPrice() {
        return basePrice;
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheese) {
            bill.append("Extra Cheese Added: 80\n");
        }
        if (extraToppings) {
            bill.append("Extra Toppings Added: ").append((isVeg ? 70 : 120)).append("\n");
        }
        if (paperBag) {
            bill.append("Paperbag Added: 20\n");
        }
        bill.append("Total Price: ").append(getTotalPrice());
        return bill.toString();
    }

    private int getTotalPrice() {
        int total = basePrice;
        if (extraCheese) {
            total += 80;
        }
        if (extraToppings) {
            total += (isVeg ? 70 : 120);
        }
        if (paperBag) {
            total += 20;
        }
        return total;
    }
}
