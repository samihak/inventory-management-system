package com.inventory.inventorymanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @RequestMapping("/")
    public String inventoryMessage() {
        return "This is my inventory project.";
    }
}