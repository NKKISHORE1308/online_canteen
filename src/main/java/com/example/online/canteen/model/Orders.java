package com.example.online.canteen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private String user_name;
    private int reg_no;
    private String Product_name;
    private int total_products;
    private float total_price;
    private Date DateOfPurchase;
    private String status;








}
