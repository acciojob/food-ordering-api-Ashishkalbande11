package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Food> items;

    public Order() {
    	// your code goes here
        items = new ArrayList<>();
    }

    public void addItem(Food food) {
    	// your code goes here
        items.add(food);
    }

    public List<Food> getItems() {
    	// your code goes here
        return items;
    }

    public double getTotalBill() {
        double totalBill = 0;
     // your code goes here
        for(Food food : items){
            totalBill += food.getPrice();
        }
        return totalBill;
    }
}
