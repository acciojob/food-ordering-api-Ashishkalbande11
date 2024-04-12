package com.driver;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {
    private Menu menu;
    private Order currentOrder;

    public FoodController() {
    	// your code goes here
        menu = new Menu();
        menu.addMenuItem(new Food(1, "Burger", 10));
        menu.addMenuItem(new Food(2, "Samosa", 15));
        menu.addMenuItem(new Food(3, "Pasta", 12));

    }

    @GetMapping("/menu")
    public List<Food> getMenu() {
    	// your code goes here
        return menu.getMenuItems();
    }

    @PostMapping("/order/{itemId}")
    public void placeOrder(@PathVariable int itemId) {
    	// your code goes here
        Food food = menu.getMenuItemById(itemId);
        if(food != null){
            currentOrder.addItem(food);
        }

    }

    @GetMapping("/order")
    public Order getCurrentOrder() {
    	// your code goes here
        return currentOrder;
    }

    @GetMapping("/order/total")
    public double getTotalBill() {
    	// your code goes here
        return currentOrder.getTotalBill();
    }
}
