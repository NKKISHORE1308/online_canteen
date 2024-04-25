package com.example.online.canteen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    public String user_name;
    public String product_name;
    public float product_price;
    public int product_quantity;
}
