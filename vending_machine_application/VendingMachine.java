package com.vending_machine_application;
import java.util.*;

public class VendingMachine {
    private Map<String, Slot<? extends Product>> slots;


    public VendingMachine() {
    this.slots = new HashMap<>();
    }

    public <T extends Product> void addProduct(String code, Slot<T> slot) {
        slots.put(code, slot);
    }

    public Product dispenseProduct(String code) {
        Slot<? extends Product> slot = slots.get(code);
        if (slot.getQuantity() > 0 ) {
            slot.setQuantity(slot.getQuantity() - 1);
            return slot.getProduct();
        }
        else {
            System.out.println("Product not available");
            return null;
        }
    }

    public void displayProducts() {
        for (Map.Entry<String, Slot<? extends Product>> entry : slots.entrySet()) {
            System.out.println("code " + entry.getKey() + "," + entry.getValue());

        }
    }
}
